package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.bar.scenarios.utils._

object FCPaymentList {

  val MinThinkTime = Environment.minThinkTime
  val MaxThinkTime = Environment.maxThinkTime
  val CreateSubHeader = Environment.createSubHeader

  val goToPaymentList = exec(http("BAR_004_001_FC_PaymentList")
    .get("/api/payment-instructions/count?status=P")
    .headers(CreateSubHeader)
    .resources(http("BAR_004_002_FC_PaymentList")
      .get("/api/payment-instructions/count?status=REJ")
      .headers(CreateSubHeader),
      http("BAR_004_003_FC_PaymentList")
        .get("/api/payment-instructions?status=P,REJ")
        .headers(CreateSubHeader)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val selectPaymentID =   exec(http("BAR_005_001_FC_SelectPaymentID")
      .get("/api/payment-instructions/${PAYID}")
      .headers(CreateSubHeader)
      .resources(http("BAR_005_002_FC_SelectPaymentID")
        .get("/api/features")
        .headers(CreateSubHeader),
        http("BAR_005_003_FC_SelectPaymentID")
          .get("/api/payment-instructions/${PAYID}/unallocated")
          .headers(CreateSubHeader),
        http("BAR_005_004_FC_SelectPaymentID")
          .get("/api/payment-action")
          .headers(CreateSubHeader),
        http("BAR_005_005_FC_SelectPaymentID")
          .get("/api/fees/jurisdictions?jurisdiction=1")
          .headers(CreateSubHeader),
        http("BAR_005_006_FC_SelectPaymentID")
          .get("/api/payment-action")
          .headers(CreateSubHeader),
        http("BAR_005_007_FC_SelectPaymentID")
          .get("/api/fees/jurisdictions?jurisdiction=2")
          .headers(CreateSubHeader)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val searchFees =   exec(http("BAR_006_001_FC_SearchFees")
      .get("/api/fees/search?query=528")
      .headers(CreateSubHeader))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val selectAndAddFees =  exec(http("BAR_007_001_FC_AddFees")
      .post("/api/payment-instructions/${PAYID}/fees")
      .headers(CreateSubHeader)
      .body(StringBody("""{"showFixedAmount":100,"case_reference":"${Daily_Sequence_ID}","fee_code":"FEE0056","fee_description":"On filing an application notice","amount":52800,"fee_version":4,"feeType":"fixed","showEditableAmount":false,"payment_instruction_id":${PaymentInstructionID}}""") )
      .resources(http("BAR_007_002_FC_AddFees")
        .get("/api/payment-instructions/${PAYID}")
        .headers(CreateSubHeader),
        http("BAR_007_003_FC_AddFees")
          .get("/api/payment-instructions/${PAYID}/unallocated")
          .headers(CreateSubHeader)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val processPayment = exec(http("BAR_008_001_FC_ProcessPayment")
    .put("/api/payment-instructions/${PAYID}")
    .headers(CreateSubHeader)
    .body(StringBody("""{"status":"V","action":"Process"}""") )
    .resources(http("BAR_008_002_FC_ProcessPayment")
      .get("/api/payment-instructions/count?status=REJ")
      .headers(CreateSubHeader),
      http("BAR_008_003_FC_ProcessPayment")
        .get("/api/payment-instructions/count?status=P")
        .headers(CreateSubHeader),
      http("BAR_008_004_FC_ProcessPayment")
        .get("/api/payment-instructions?status=P,REJ")
        .headers(CreateSubHeader)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)


}
