package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.bar.scenarios.utils._
import scala.concurrent.duration._

object BARLogout {
  val MinThinkTime = Environment.minThinkTime
  val MaxThinkTime = Environment.maxThinkTime

  val Logout = exec(http("BAR_050_Logout")
    .get("/logout")
    .check(status.in(200,404)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)
}
