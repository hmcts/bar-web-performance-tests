package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import uk.gov.hmcts.bar.scenarios.utils._

object LandingBARLoginPage {

  val MinThinkTime = Environment.minThinkTime
  val MaxThinkTime = Environment.maxThinkTime
  val constantThinkTime = Environment.constantthinkTime
  val MinWaitForNextIteration = Environment.minWaitForNextIteration
  val MaxWaitForNextIteration = Environment.maxWaitForNextIteration

  val IdAMURL = Environment.idamURL

  val FeesClerkUserData = csv("BAR_FeeClerkUserData.csv").circular
  val FeesClerkUserDataIDs = csv("BAR_FeeClerkUserIDs.csv").circular
  val BashURL = Environment.baseURL



 val barLoginPage = exec(http("BAR_001_001_Login")
   .get("/")
   .check(regex(""".*state=(.*)&amp;client_id""").saveAs("State")))

   .exec(http("BAR_001_002_Login")
     .get(IdAMURL + "?response_type=code&state=${State}&client_id=bar_frontend&redirect_uri=" + BashURL + "/oauth2/callback")
     .check(css("input[name='_csrf']", "value").saveAs("csrftoken")))
   .pause(MinThinkTime seconds, MaxThinkTime seconds)
   .feed(FeesClerkUserData)
   .feed(FeesClerkUserDataIDs)
}