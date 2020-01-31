package uk.gov.hmcts.bar.scenarios

import java.text.SimpleDateFormat
import java.util.Calendar

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.bar.scenarios.utils._


object DMPaymentList {

  val CreateSubHeader = Environment.createSubHeader
  val MinThinkTime = Environment.DMminThinkTime
  val MaxThinkTime = Environment.DMmaxThinkTime

  val format = new SimpleDateFormat("ddMMyyyy")
  val StartDate = format.format(Calendar.getInstance().getTime())
  val EndDate = format.format(Calendar.getInstance().getTime())

  val DMNavigateToPaymentList = exec(http("BAR_009_001_DM_PaymentList")
    .get("/api/users/${ParamLoggedInUserID}/payment-instructions?status=PA")
    .headers(CreateSubHeader))

    .exec(http("BAR_009_001_DM_PaymentList")
      .get("/api/payment-instructions/count?status=D&startDate=" + StartDate + "&endDate=" + EndDate + "")
      .headers(CreateSubHeader))
    .exec(http("BAR_009_002_DM_PaymentList")
      .get("/api/payment-instructions/count?status=TTB&startDate=" + StartDate + "&endDate=" + EndDate + "")
      .headers(CreateSubHeader))
    .exec(http("BAR_009_003_DM_PaymentList")
      .get("/api/payment-instructions/count?status=V&startDate=" + StartDate + "&endDate=" + EndDate + "")
      .headers(CreateSubHeader))

    .exec(http("BAR_009_004_DM_PaymentList")
      .get("/api/payment-instructions/count?status=A")
      .headers(CreateSubHeader))
    .exec(http("BAR_009_005_DM_PaymentList")
      .get("/api/payment-instructions/count?status=P")
      .headers(CreateSubHeader))
    .exec(http("BAR_009_006_DM_PaymentList")
      .get("/api/payment-instructions/count?status=PA")
      .headers(CreateSubHeader))

    .exec(http("BAR_009_007_DM_PaymentList")
      .get("/api/users/pi-stats?status=A")
      .headers(CreateSubHeader))
    .exec(http("BAR_009_008_DM_PaymentList")
      .get("/api/users/pi-stats?status=TTB")
      .headers(CreateSubHeader))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

}
