package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.bar.scenarios.utils._

object DMTransferToBAR {
  val CreateSubHeader = Environment.createSubHeader
  val MinThinkTime = Environment.DMminThinkTime
  val MaxThinkTime = Environment.DMmaxThinkTime

  val transferToBAR = exec(http("BAR_010_001_DM_ConfirmBarTransfer")
    .get("/api/current-time")
    .headers(CreateSubHeader))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

    .exec(http("BAR_011_001_DM_ConfirmBarTransfer_UploadStatistics")
      .get("/api/payment-instructions/send-to-payhub/1569409212000")
      .headers(CreateSubHeader))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

    .exec(http("BAR_011_002_DM_ConfirmBarTransfer_UploadStatistics")
      .get("/api/users/pi-stats?status=TTB")
      .headers(CreateSubHeader))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

}
