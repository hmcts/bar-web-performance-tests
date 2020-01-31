package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.bar.scenarios.utils._

import scala.util.Random

object DMActions {

  val CreateSubHeader = Environment.createSubHeader
  val MinThinkTime = Environment.DMminThinkTime
  val MaxThinkTime = Environment.DMmaxThinkTime

  val rnd: Random = new Random()
  val RndDMVal = rnd.nextInt(5)


  val selectSeniorFeeClerk = 	exec(http("BAR_003_001_DM_SelectSFC")
    .get("/api/users/${FeeSRClerkUserID}/payment-instructions/stats?status=A")
    .headers(CreateSubHeader)
    /*.resources(http("BAR_003_002_DM_SelectSFC")
      .get("/api/payment-action")
      .headers(CreateSubHeader),
      http("BAR_003_002_DM_SelectSFC")
        .get("/api/payment-action")
        .headers(CreateSubHeader)))*/
  )
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val DMProcessPayment =  exec(http("BAR_004_001_DM_SelectProcessPayment")
      .get("/api/users/${FeeSRClerkUserID}/payment-instructions?status=A&paymentType=CARD&action=Process&bgcNumber=isNull")
      .check(jsonPath("$.data[*].amount").findAll.saveAs("DM_Pay_Amount"))
      .check(jsonPath("$.data[*].currency").findAll.saveAs("DM_Pay_Currency"))
      .check(jsonPath("$.data[*].payer_name").findAll.saveAs("DM_Payer_Name"))
      .check(jsonPath("$.data[*].id").findAll.saveAs("DM_PAY_ID"))
      .check(jsonPath("$.data[*].authorization_code").findAll.saveAs("DM_Pay_Auth_Code"))
      .headers(CreateSubHeader))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val DMViewPayment = exec(http("BAR_005_001_DM_ViewPayment")
      .get("/api/payment-instructions/${DM_PAY_ID(0)}")
      .headers(CreateSubHeader)
      .resources(http("BAR_005_002_DM_ViewPayment")
        .get("/api/features")
        .headers(CreateSubHeader),
        http("BAR_005_003_DM_ViewPayment")
          .get("/api/payment-instructions/${DM_PAY_ID(0)}/unallocated")
          .headers(CreateSubHeader),
        http("BAR_005_004_DM_ViewPayment")
          .get("/api/payment-action")
          .headers(CreateSubHeader),
        http("BAR_005_005_DM_ViewPayment")
          .get("/api/fees/jurisdictions?jurisdiction=1")
          .headers(CreateSubHeader),
        http("BAR_005_006_DM_ViewPayment")
          .get("/api/payment-action")
          .headers(CreateSubHeader),
        http("BAR_005_007_DM_ViewPayment")
          .get("/api/fees/jurisdictions?jurisdiction=2")
          .headers(CreateSubHeader)))
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .exec(http("BAR_006_001_DM_GoBackToPaymentList")
        .get("/api/users/${FeeSRClerkUserID}/payment-instructions/stats?status=A")
        .headers(CreateSubHeader))
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .exec(http("BAR_006_002_DM_GoBackToPaymentList")
        .get("/api/users/${FeeSRClerkUserID}/payment-instructions?status=A&paymentType=CARD&action=Process&bgcNumber=isNull")
        .headers(CreateSubHeader))
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val DMubmitPayment =   exec(http("BAR_007_001_DM_ApproveSinglePayment")
      .post("/api/payment/cards")
      .headers(CreateSubHeader)
      .body(StringBody("""{"amount":${DM_Pay_Amount(0)},"currency":"${DM_Pay_Currency(0)}","payer_name":"${DM_Payer_Name(0)}","unallocated_amount":0,"withdrawReasonModel":{"reasons":[{"id":1,"reason":"Duplicate Entry"},{"id":2,"reason":"Fee not found"},{"id":3,"reason":"Other (add comment)"}]},"returnReasonModel":{"reasons":[{"id":1,"reason":"Overpayment"},{"id":2,"reason":"Incorrect payment amount"},{"id":3,"reason":"Other (add comment)"}]},"id":${DM_PAY_ID(0)},"payment_type":{"id":"CARD","name":"Card"},"status":"TTB","action":"Process","authorization_code":"${DM_Pay_Auth_Code(0)}"}""") ))


    .exec(http("BAR_008_002_DM_ApproveBulkPayment")
      .get("/api/users/${FeeSRClerkUserID}/payment-instructions/stats?status=A")
      .headers(CreateSubHeader))

    .exec(http("BAR_008_003_DM_ApproveBulkPayment")
      .get("/api/users/${FeeSRClerkUserID}/payment-instructions?status=A&paymentType=CARD&action=Process&bgcNumber=isNull")
      .headers(CreateSubHeader))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

}
