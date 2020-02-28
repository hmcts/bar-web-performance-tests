package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.bar.scenarios.utils._

import scala.util.Random

object SFCActions {

  val CreateSubHeader = Environment.createSubHeader
  val MinThinkTime = Environment.SFCminThinkTime
  val MaxThinkTime = Environment.SFCmaxThinkTime

  val rnd: Random = new Random()
  val RndSFMVal = rnd.nextInt(5)

  val selectFeeClerk = exec(http("BAR_003_001_SFC_SelectFC")
    .get("/api/users/${FeeClerkUserId}/payment-instructions/stats?status=PA")
    .headers(CreateSubHeader)
    .resources(http("BAR_003_002_SFC_SelectFC")
      .get("/api/payment-action")
      .headers(CreateSubHeader),
      http("BAR_003_003_SFC_SelectFC")
        .get("/api/payment-action")
        .headers(CreateSubHeader)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val processPayment = exec(http("BAR_004_001_SFC_SelectProcessPayment")
    .get("/api/users/${FeeClerkUserId}/payment-instructions?status=PA&paymentType=CARD&action=Process&bgcNumber=isNull")
    .headers(CreateSubHeader)
    .check(jsonPath("$.data[*].amount").findAll.saveAs("SFC_Pay_Amount"))
    .check(jsonPath("$.data[*].currency").findAll.saveAs("SFC_Pay_Currency"))
    .check(jsonPath("$.data[*].payer_name").findAll.saveAs("SFC_Payer_Name"))
    .check(jsonPath("$.data[*].id").findAll.saveAs("SFC_PAY_ID"))
    .check(jsonPath("$.data[*].authorization_code").findAll.saveAs("SFC_Pay_Auth_Code")))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)


  val SFCViewPayment = exec(http("BAR_005_001_SFC_ViewPayment")
      .get("/api/payment-instructions/${SFC_PAY_ID(0)}")
      .headers(CreateSubHeader)
      .resources(http("BAR_005_002_SFC_ViewPayment")
        .get("/api/features")
        .headers(CreateSubHeader),
        http("BAR_005_003_SFC_ViewPayment")
          .get("/api/payment-instructions/${SFC_PAY_ID(0)}/unallocated")
          .headers(CreateSubHeader),
        http("BAR_005_004_SFC_ViewPayment")
          .get("/api/payment-action")
          .headers(CreateSubHeader),
        http("BAR_005_005_SFC_ViewPayment")
          .get("/api/fees/jurisdictions?jurisdiction=1")
          .headers(CreateSubHeader),
        http("BAR_005_006_SFC_ViewPayment")
          .get("/api/payment-action")
          .headers(CreateSubHeader),
        http("BAR_005_007_SFC_ViewPayment")
          .get("/api/fees/jurisdictions?jurisdiction=2")
          .headers(CreateSubHeader)))
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .exec(http("BAR_006_001_SFC_GoBackToPaymentList")
        .get("/api/users/${FeeClerkUserId}/payment-instructions/stats?status=PA")
        .headers(CreateSubHeader))
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .exec(http("BAR_006_002_SFC_GoBackToPaymentList")
        .get("/api/users/${FeeClerkUserId}/payment-instructions?status=PA&paymentType=CARD&action=Process&bgcNumber=isNull")
        .headers(CreateSubHeader))
      .pause(MinThinkTime seconds, MaxThinkTime seconds)



  val SFCSubmitPayment = exec(http("BAR_007_001_SFC_ApproveSinglePayment")
      .post("/api/payment/cards")
      .headers(CreateSubHeader)
      .body(StringBody("""{"amount":${SFC_Pay_Amount(0)},"currency":"${SFC_Pay_Currency(0)}","payer_name":"${SFC_Payer_Name(0)}","unallocated_amount":0,"withdrawReasonModel":{"reasons":[{"id":1,"reason":"Duplicate Entry"},{"id":2,"reason":"Fee not found"},{"id":3,"reason":"Other (add comment)"}]},"returnReasonModel":{"reasons":[{"id":1,"reason":"Overpayment"},{"id":2,"reason":"Incorrect payment amount"},{"id":3,"reason":"Other (add comment)"}]},"id":${SFC_PAY_ID(0)},"payment_type":{"id":"CARD","name":"Card"},"status":"A","action":"Process","authorization_code":"${SFC_Pay_Auth_Code(0)}"}""")))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

    .exec(http("BAR_008_002_SFC_ApproveBulkPayment")
      .get("/api/users/${FeeClerkUserId}/payment-instructions?status=PA&paymentType=CARD&action=Process&bgcNumber=isNull")
      .headers(CreateSubHeader))
    .exec(http("BAR_008_003_SFC_ApproveBulkPayment")
      .get("/api/users/${FeeClerkUserId}/payment-instructions/stats?status=PA")
      .headers(CreateSubHeader))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)
}
