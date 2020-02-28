package uk.gov.hmcts.bar.simulation

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.bar.scenarios._
import uk.gov.hmcts.bar.scenarios.utils._
import scala.concurrent.duration._

class BARPTSimulation extends Simulation {

  val BashURL = Environment.baseURL
  val httpProtocol = http
    .baseUrl(BashURL)
    .proxy(Proxy("proxyout.reform.hmcts.net", 8080))


  val SCN = scenario("User Journey")
      .exec(
      BARLogout.Logout,
      LandingBARLoginPage.barLoginPage,
      SubmitLogin.loginAsFC,
      FCAddPayment.addPayment,
      FCPaymentList.goToPaymentList,
      FCPaymentList.selectPaymentID,
      FCPaymentList.searchFees,
      FCPaymentList.selectAndAddFees,
      FCPaymentList.processPayment,
      FCSubmitPayment.goToCheckAndSubmit,
      FCSubmitPayment.submitPayment,
      BARLogout.Logout
    )


  val SFCSCN = scenario("Senior FEE Clerk User Journey")

    .exec(
      BARLogout.Logout,
      LandingBARLoginPage.barLoginPage,
      SubmitLogin.loginAsSFC,
      SFCActions.selectFeeClerk,
      SFCActions.processPayment,
      SFCActions.SFCViewPayment,
      SFCActions.SFCSubmitPayment,
      BARLogout.Logout
    )


  val DMSCN = scenario("DM User Journey")
    .exec(
      BARLogout.Logout,
      LandingBARLoginPage.barLoginPage,
      SubmitLogin.loginAsDM,
      DMActions.selectSeniorFeeClerk,
      DMActions.DMProcessPayment,
      DMActions.DMViewPayment,
      DMActions.DMubmitPayment,
      DMPaymentList.DMNavigateToPaymentList,
      DMTransferToBAR.transferToBAR,
      BARLogout.Logout
    )


  setUp(SCN.inject(rampUsers(1) during (1 minutes)),
    SFCSCN.inject(rampUsers(1) during (1 minutes)),
    DMSCN.inject(rampUsers(1) during (1 minutes))
      ).protocols(httpProtocol)
    .maxDuration(10 minute)

}
