package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.bar.scenarios.utils.Environment._

object SeniorFeeClerkScenario extends Simulation {

	val senior_fee_clerk_headers_65 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|da035.3vnBW",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76947012_908h28vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e3",
		"x-dtreferer" -> "${baseURL}/payment-overview",
		"x-requested-with" -> "XMLHttpRequest")

	val senior_fee_clerk_headers_66 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|da035.5PX3K",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76947012_908h29vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e3",
		"x-dtreferer" -> "${baseURL}/payment-overview",
		"x-requested-with" -> "XMLHttpRequest")

	val senior_fee_clerk_headers_67 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|da035.LC1LZ",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76947012_908h30vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e3",
		"x-dtreferer" -> "${baseURL}/payment-overview",
		"x-requested-with" -> "XMLHttpRequest")

	val senior_fee_clerk_headers_76 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|da035.WQFhY",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76947012_908h33vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e4",
		"x-dtreferer" -> "${baseURL}/users/${userId}/payment-instructions/stats?status=PA&fullName=Anish%20feeclerk",
		"x-requested-with" -> "XMLHttpRequest")

	val senior_fee_clerk_headers_92 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json",
		"csrf-token" -> "${csrfToken}",
		"origin" -> baseURL,
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|da035.UUd0L",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76947012_908h36vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e5",
		"x-requested-with" -> "XMLHttpRequest")

	val senior_fee_clerk_headers_93 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|da035.toPlv",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76947012_908h38vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e5",
		"x-requested-with" -> "XMLHttpRequest")

	val senior_fee_clerk_headers_96 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|da035.Ddgsy",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76947012_908h37vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e5",
		"x-requested-with" -> "XMLHttpRequest")

	val seniorFeeClerkScenario = scenario("Senior Fee Clerk Scenario")

	// Click on the second instance of 'Anish feeclerk'
	.group("BAR${service}_030_SelectClerk") {
		exec(http("BAR${service}_030_010_PaymentAction1")
			.get("/api/payment-action")
			.headers(senior_fee_clerk_headers_65)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_030_020_Users")
			.get("/api/users/${userId}/payment-instructions/stats?status=PA")
			.headers(senior_fee_clerk_headers_66)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_030_030_PaymentAction2")
			.get("/api/payment-action")
			.headers(senior_fee_clerk_headers_67)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Click on the 'card' option
	.group("BAR${service}_040_SelectCard") {
		exec(http("BAR${service}_040_010_Users")
			.get("/api/users/${userId}/payment-instructions?status=PA&paymentType=CARD&action=Process&bgcNumber=isNull")
			.headers(senior_fee_clerk_headers_76)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Select the submitted payment and click on 'Approve'
	.group("BAR${service}_050_Approve") {
		exec(http("BAR${service}_050_010_Payment")
			.post("/api/payment/cards")
			.headers(senior_fee_clerk_headers_92)
			.body(StringBody("""{"amount":55000,"currency":"GBP","payer_name":"Mr Joe Smith","unallocated_amount":0,"withdrawReasonModel":{"reasons":[{"id":1,"reason":"Duplicate Entry"},{"id":2,"reason":"Fee not found"},{"id":3,"reason":"Other (add comment)"}]},"returnReasonModel":{"reasons":[{"id":1,"reason":"Overpayment"},{"id":2,"reason":"Incorrect payment amount"},{"id":3,"reason":"Other (add comment)"}]},"id":${paymentId},"payment_type":{"id":"CARD","name":"Card"},"status":"A","action":"Process","authorization_code":"654321"}"""))
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_050_020_Users1")
			.get("/api/users/${userId}/payment-instructions/stats?status=PA")
			.headers(senior_fee_clerk_headers_93)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_050_030_Users2")
			.get("/api/users/${userId}/payment-instructions?status=PA&paymentType=CARD&action=Process&bgcNumber=isNull")
			.headers(senior_fee_clerk_headers_96)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

}