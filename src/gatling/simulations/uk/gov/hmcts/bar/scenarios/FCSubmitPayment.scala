package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.bar.scenarios.utils._

import java.text.SimpleDateFormat
import java.util.Calendar

object FCSubmitPayment {

  val MinThinkTime = Environment.minThinkTime
  val MaxThinkTime = Environment.maxThinkTime
  val CreateSubHeader = Environment.createSubHeader


  val format = new SimpleDateFormat("ddMMyyyy")
  val StartDate = format.format(Calendar.getInstance().getTime())
  val EndDate = format.format(Calendar.getInstance().getTime())

  val goToCheckAndSubmit = exec(http("BAR_009_001_FC_CheckAndSubmit")
    .get("/api/payment-instructions/count?userId=${BarUserID}&status=PA&startDate=" + StartDate + "&endDate=" + EndDate + "")
    .headers(CreateSubHeader)
    .resources(http("BAR_009_002_FC_CheckAndSubmit")
      .get("/api/users/${BarUserID}/payment-instructions/stats?status=V")
      .headers(CreateSubHeader),
      http("BAR_009_002_FC_CheckAndSubmit")
        .get("/api/users/${BarUserID}/payment-instructions?status=V")
        .headers(CreateSubHeader),
      http("BAR_009_003_FC_CheckAndSubmit")
        .get("/api/users/${BarUserID}/payment-instructions?status=V&action=Process")
        .headers(CreateSubHeader)
        .check(jsonPath("$.data[0].amount").saveAs("Pay_Amount"))
        .check(jsonPath("$.data[0].currency").saveAs("Pay_Currency"))
        .check(jsonPath("$.data[0].payer_name").saveAs("Payer_Name"))
        .check(jsonPath("$.data[0].id").saveAs("PAY_ID"))
        .check(jsonPath("$.data[0].authorization_code").saveAs("Pay_Auth_Code"))))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

    val submitPayment = exec(http("BAR_010_001_FC_SubmitPayment")
      .post("/api/payment/cards")
      .headers(CreateSubHeader)
      .body(StringBody("""{"amount":${Pay_Amount},"currency":"${Pay_Currency}","payer_name":"${Payer_Name}","unallocated_amount":0,"withdrawReasonModel":{"reasons":[{"id":1,"reason":"Duplicate Entry"},{"id":2,"reason":"Fee not found"},{"id":3,"reason":"Other (add comment)"}]},"returnReasonModel":{"reasons":[{"id":1,"reason":"Overpayment"},{"id":2,"reason":"Incorrect payment amount"},{"id":3,"reason":"Other (add comment)"}]},"id":${PAY_ID},"payment_type":{"id":"CARD","name":"Card"},"status":"PA","action":"Process","authorization_code":"${Pay_Auth_Code}"}""") ))

      .exec(http("BAR_010_002_FC_SubmitPayment")
      .get("/api/payment-instructions/count?userId=${BarUserID}&status=PA&startDate=" + StartDate + "&endDate=" + EndDate + "")
      .headers(CreateSubHeader))

    .exec(http("BAR_010_003_FC_SubmitPayment")
      .get("/api/users/${BarUserID}/payment-instructions/stats?status=V")
      .headers(CreateSubHeader))

    .exec(http("BAR_010_004_FC_SubmitPayment")
      .get("/api/users/${BarUserID}/payment-instructions?status=V&action=Process")
      .headers(CreateSubHeader))

    .exec(http("BAR_010_005_FC_SubmitPayment")
      .get("/api/users/${BarUserID}/payment-instructions?status=V")
      .headers(CreateSubHeader))

    .pause(MinThinkTime seconds, MaxThinkTime seconds)

}
