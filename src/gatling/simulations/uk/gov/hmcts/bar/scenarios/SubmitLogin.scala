package uk.gov.hmcts.bar.scenarios

import java.text.SimpleDateFormat
import java.util.Calendar

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.bar.scenarios.utils._

object SubmitLogin {

  val MinThinkTime = Environment.minThinkTime
  val MaxThinkTime = Environment.maxThinkTime
  val constantThinkTime = Environment.constantthinkTime
  val MinWaitForNextIteration = Environment.minWaitForNextIteration
  val MaxWaitForNextIteration = Environment.maxWaitForNextIteration

  val IdAMURL = Environment.idamURL

  val CreateSubHeader = Environment.createSubHeader
  val BashURL = Environment.baseURL

  val format = new SimpleDateFormat("ddMMyyyy")
  val StartDate = format.format(Calendar.getInstance().getTime())
  val EndDate = format.format(Calendar.getInstance().getTime())

  val loginAsFC = exec(http("BAR_002_001_FC_SubmitLogin")
    .post(IdAMURL + "?response_type=code&state=${State}&client_id=bar_frontend&redirect_uri=" + BashURL + "/oauth2/callback")
    .formParam("username", "${FCUserName}")
    .formParam("password", "${FCUserPWD}")
    .formParam("save", "Sign in")
    .formParam("selfRegistrationEnabled", "true")
    .formParam("_csrf", "${csrftoken}")
    .check(regex(""".*content="(.*)"><title>""").saveAs("CSRF_TOKEN"))
    .check(status in (200,302)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

    .exec(http("BAR_002_002_FC_SubmitLogin")
      .get("/api/monitoring-tools")
      .headers(CreateSubHeader)
      .resources(http("BAR_002_003_FC_SubmitLogin")
        .get("/api/sites?my-sites=true")
        .headers(CreateSubHeader),
        http("BAR_002_004_FC_SubmitLogin")
          .get("/api/payment-types")
          .headers(CreateSubHeader),
        http("BAR_002_005_FC_SubmitLogin")
          .get("/api/payment-instructions/count?status=REJ")
          .headers(CreateSubHeader),
        http("BAR_002_006_FC_SubmitLogin")
          .get("/api/sites?my-sites=true")
          .headers(CreateSubHeader),
        http("BAR_002_007_FC_SubmitLogin")
          .get("/api/payment-instructions/count?status=P")
          .headers(CreateSubHeader),
        http("BAR_002_008_FC_SubmitLogin")
          .get("/api/payment-types")
          .headers(CreateSubHeader),
        http("BAR_002_009_FC_SubmitLogin")
          .get("/stylesheets/lib/images/open-government-licence_2x.png?0.19.2"),
        http("BAR_002_010_FC_SubmitLogin")
          .get("/stylesheets/lib/images/govuk-crest-2x.png?0.19.2"),
        http("BAR_002_011_FC_SubmitLogin")
          .get("/api/payment-instructions?status=P,REJ")
          .headers(CreateSubHeader)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val loginAsSFC = exec(http("BAR_002_001_SFC_SubmitLogin")
    .post(IdAMURL + "?response_type=code&state=${State}&client_id=bar_frontend&redirect_uri=" + BashURL + "/oauth2/callback")
    .formParam("username", "${SrFeeClerkUserUserName}")
    .formParam("password", "${SrFeeClerkUserPWD}")
    .formParam("save", "Sign in")
    .formParam("selfRegistrationEnabled", "true")
    .formParam("_csrf", "${csrftoken}")
    .check(regex(""".*content="(.*)"><title>""").saveAs("CSRF_TOKEN"))
    .check(headerRegex("Set-Cookie", "__user-info=%7B%22id%22%3A%22(.*)%22%2C%22forename").saveAs("ParamLoggedInUserID"))
    .check(status in (200,302)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)


    .exec(http("BAR_002_002_SFC_SubmitLogin")
      .get("/api/monitoring-tools")
      .headers(CreateSubHeader)
      .resources(http("BAR_002_003_SFC_SubmitLogin")
        .get("/api/sites?my-sites=true")
        .headers(CreateSubHeader),
        http("BAR_002_004_SFC_SubmitLogin")
          .get("/api/payment-types")
          .headers(CreateSubHeader),
        http("BAR_002_005_SFC_SubmitLogin")
          .get("/api/payment-instructions/count?status=V&startDate=" + StartDate + "&endDate=" + EndDate + "")
          .headers(CreateSubHeader),
        http("BAR_002_006_SFC_SubmitLogin")
          .get("/api/payment-instructions/count?status=D&startDate=" + StartDate + "&endDate=" + EndDate + "")
          .headers(CreateSubHeader),
        http("BAR_002_007_SFC_SubmitLogin")
          .get("/api/payment-instructions/count?status=TTB&startDate=" + StartDate + "&endDate=" + EndDate + "")
          .headers(CreateSubHeader),
        http("BAR_002_008_SFC_SubmitLogin")
          .get("/api/users/${ParamLoggedInUserID}/payment-instructions?status=PA")
          .headers(CreateSubHeader),
        http("BAR_002_009_SFC_SubmitLogin")
          .get("/api/users/pi-stats?status=RDM&oldStatus=A")
          .headers(CreateSubHeader),
        http("BAR_002_010_SFC_SubmitLogin")
          .get("/api/payment-instructions/count?status=A")
          .headers(CreateSubHeader),
        http("BAR_002_011_SFC_SubmitLogin")
          .get("/stylesheets/lib/images/open-government-licence_2x.png?0.19.2"),
        http("BAR_002_012_SFC_SubmitLogin")
          .get("/api/payment-instructions/count?status=P")
          .headers(CreateSubHeader),
        http("BAR_002_013_SFC_SubmitLogin")
          .get("/stylesheets/lib/images/govuk-crest-2x.png?0.19.2"),
        http("BAR_002_014_SFC_SubmitLogin")
          .get("/api/sites?my-sites=true")
          .headers(CreateSubHeader),
        http("BAR_002_015_SFC_SubmitLogin")
          .get("/api/users/pi-stats?status=PA")
          .headers(CreateSubHeader),
        http("BAR_002_016_SFC_SubmitLogin")
          .get("/api/payment-types")
          .headers(CreateSubHeader),
        http("BAR_002_017_SFC_SubmitLogin")
          .get("/api/payment-instructions/count?status=PA")
          .headers(CreateSubHeader)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)


  val loginAsDM = exec(http("BAR_002_001_DM_SubmitLogin")
    .post(IdAMURL + "?response_type=code&state=${State}&client_id=bar_frontend&redirect_uri=" + BashURL + "/oauth2/callback")
    .formParam("username", "${DMUserUserName}")
    .formParam("password", "${DMUserPWD}")
    .formParam("save", "Sign in")
    .formParam("selfRegistrationEnabled", "true")
    .formParam("_csrf", "${csrftoken}")
    .check(regex(""".*content="(.*)"><title>""").saveAs("CSRF_TOKEN"))
    .check(headerRegex("Set-Cookie", "__user-info=%7B%22id%22%3A%22(.*)%22%2C%22forename").saveAs("ParamLoggedInUserID"))
    .check(status in (200,302)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

    .exec(http("BAR_002_002_DM_SubmitLogin")
      .get("/api/monitoring-tools")
       .headers(CreateSubHeader)
      .resources(http("BAR_002_003_DM_SubmitLogin")
        .get("/api/payment-types")
        .headers(CreateSubHeader),
        http("BAR_002_004_DM_SubmitLogin")
          .get("/api/payment-types")
          .headers(CreateSubHeader),
        http("BAR_002_005_DM_SubmitLogin")
          .get("/api/payment-instructions/count?status=D&startDate=" + StartDate + "&endDate=" + EndDate + "")
          .headers(CreateSubHeader),
        http("BAR_002_006_DM_SubmitLogin")
          .get("/api/payment-instructions/count?status=TTB&startDate=" + StartDate + "&endDate=" + EndDate + "")
          .headers(CreateSubHeader),
        http("BAR_002_007_DM_SubmitLogin")
          .get("/api/users/6401f3a7-2407-493c-a651-bec635cd6ee6/payment-instructions?status=PA")
          .headers(CreateSubHeader),
        http("BAR_002_008_DM_SubmitLogin")
          .get("/api/sites?my-sites=true")
          .headers(CreateSubHeader),
        http("BAR_002_009_DM_SubmitLogin")
          .get("/stylesheets/lib/images/open-government-licence_2x.png?0.19.2"),
        http("BAR_002_010_DM_SubmitLogin")
          .get("/stylesheets/lib/images/govuk-crest-2x.png?0.19.2"),
        http("BAR_002_011_DM_SubmitLogin")
          .get("/api/payment-instructions/count?status=A")
          .headers(CreateSubHeader),
        http("BAR_002_012_DM_SubmitLogin")
          .get("/api/payment-instructions/count?status=P")
          .headers(CreateSubHeader),
        http("BAR_002_013_DM_SubmitLogin")
          .get("/api/users/pi-stats?status=A")
          .headers(CreateSubHeader),
        http("BAR_002_014_DM_SubmitLogin")
          .get("/api/users/pi-stats?status=TTB")
          .headers(CreateSubHeader),
        http("BAR_002_015_DM_SubmitLogin")
          .get("/api/sites?my-sites=true")
          .headers(CreateSubHeader),
        http("BAR_002_016_DM_SubmitLogin")
          .get("/api/payment-instructions/count?status=V&startDate=" + StartDate + "&endDate=" + EndDate + "")
          .headers(CreateSubHeader),
        http("BAR_002_017_DM_SubmitLogin")
          .get("/api/payment-instructions/count?status=PA")
          .headers(CreateSubHeader)))
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

}
