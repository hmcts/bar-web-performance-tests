package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.bar.scenarios.utils._

import scala.util.Random

object FCAddPayment {

  val MinThinkTime = Environment.minThinkTime
  val MaxThinkTime = Environment.maxThinkTime

  val rnd: Random = new Random()

  private def Authorization_code():  String = rnd.alphanumeric.take(6).mkString
  private def PayerName(): String = rnd.alphanumeric.take(10).mkString

  val CreateSubHeader = Environment.createSubHeader

  val addPayment = exec(
    _.setAll(
      ("PAYERName", PayerName()),
      ("Authorization_CODE",Authorization_code())))

    .exec(http("BAR_003_001_FC_AddPayment")
      .post("/api/payment/cards")
      .headers(CreateSubHeader)
      .check(regex(""".*"barUserId":"(.*)"}""").saveAs("BarUserID"))
      .check(regex(""".*"paymentInstructionId":(.*),"status""").saveAs("PaymentInstructionID"))
      .check(regex(""".*"updateTime":"(.*)"},"barUserId""").saveAs("PaymentUpdateTime"))
      .check(regex(""".*"payment_date":"(.*)","site_id""").saveAs("CreatePayment_Date"))
      .check(regex(""".*"site_id":"(.*)","daily_sequence_id""").saveAs("Site_ID"))
      .check(regex(""".*"daily_sequence_id":"(.*)","transferred_to_payhub""").saveAs("Daily_Sequence_ID"))
      .check(regex(""".*"id":(.*),"payment_date""").saveAs("PAYID"))
      .body(StringBody("""{"amount":52800,"currency":"GBP","payer_name":"KapilJain ${PAYERName}","unallocated_amount":0,"withdrawReasonModel":{"reasons":[{"id":1,"reason":"Duplicate Entry"},{"id":2,"reason":"Fee not found"},{"id":3,"reason":"Other (add comment)"}]},"returnReasonModel":{"reasons":[{"id":1,"reason":"Overpayment"},{"id":2,"reason":"Incorrect payment amount"},{"id":3,"reason":"Other (add comment)"}]},"payment_type":{"id":"CARD","name":"Card"},"authorization_code":"${Authorization_CODE}"}""") ))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

}
