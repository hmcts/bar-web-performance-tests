package uk.gov.hmcts.bar.simulation

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.bar.scenarios._
import uk.gov.hmcts.bar.scenarios.DMClerkScenario._
import uk.gov.hmcts.bar.scenarios.utils._
import scala.concurrent.duration._

class BARPTSimulation extends Simulation
{
  val BaseURL = Environment.baseURL
  val feeClerkFeeder = csv("BAR_FeeClerkUserData.csv").circular
  val seniorFeeClerkFeeder = csv("BAR_SeniorFeeClerkUserData.csv").circular
  val DMClerkFeeder = csv("BAR_DMUserData.csv").circular

  val httpProtocol = http
    .baseUrl(BaseURL)
    .inferHtmlResources()
    .silentResources
    .proxy(Proxy("proxyout.reform.hmcts.net", 8080))

  val BARScenario = scenario("BAR Scenario")

  // Fee clerk scenario
  .feed(feeClerkFeeder)
  .feed(Feeders.FeeClerkFeeder)
  .exec(
    LoginScenario.Homepage,
    LoginScenario.FeeClerkLogin,
    FeeClerkScenario.feeClerkScenario,
    LoginScenario.Logout
  )

  // Senior fee clerk scenario
  .feed(seniorFeeClerkFeeder)
  .feed(Feeders.SeniorFeeClerkFeeder)
  .exec(
    LoginScenario.Homepage,
    LoginScenario.seniorFeeClerkLogin,
    SeniorFeeClerkScenario.seniorFeeClerkScenario,
    LoginScenario.Logout
  )

  // DM clerk scenario
  .feed(DMClerkFeeder)
  .feed(Feeders.DMClerkFeeder)
  .exec(
    LoginScenario.Homepage,
    LoginScenario.DMClerkLogin,
    dmClerkScenario,
    LoginScenario.Logout
  )

  setUp(BARScenario.inject(rampUsers(1) during (5 minutes)))
    .protocols(httpProtocol)
    .assertions(global.successfulRequests.percent.is(100))

}
