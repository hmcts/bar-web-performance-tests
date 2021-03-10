package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.bar.scenarios.utils.Environment._

object FeeClerkScenario extends Simulation {

	val fee_clerk_headers_56 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json",
		"csrf-token" -> "${csrfToken}",
		"origin" -> baseURL,
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.nRXWt",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h20vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e3",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_62 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.Ns3gP",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h22vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e4",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_63 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.ZtUDO",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h23vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e4",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_64 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.TWcFI",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h24vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e4",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_69 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.eQtUJ",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h25vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e4",
		"x-dtreferer" -> "${baseURL}/dashboard",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_70 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.pxLs1",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h26vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e4",
		"x-dtreferer" -> "${baseURL}/dashboard",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_71 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.SfbnV",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h27vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e4",
		"x-dtreferer" -> "${baseURL}/dashboard",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_72 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.wvnEY",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h29vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e4",
		"x-dtreferer" -> "${baseURL}/dashboard",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_76 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.Ezghv",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_78 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json",
		"csrf-token" -> "${csrfToken}",
		"origin" -> baseURL,
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.8ZWpJ",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h31vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e5",
		"x-dtreferer" -> "${baseURL}/feelog/edit/${paymentId}#fees",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_79 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.jMD43",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h32vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e5",
		"x-dtreferer" -> "${baseURL}/feelog/edit/${paymentId}#fees",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_80 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.7An6j",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h33vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e5",
		"x-dtreferer" -> "${baseURL}/feelog/edit/${paymentId}#fees",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_100 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json",
		"csrf-token" -> "${csrfToken}",
		"origin" -> baseURL,
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.QKJAc",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h36vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e6",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_102 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.Vyb9x",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h39vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e6",
		"x-dtreferer" -> "${baseURL}/feelog/edit/${paymentId}",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_103 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.OFm4",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h38vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e6",
		"x-dtreferer" -> "${baseURL}/feelog/edit/${paymentId}",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_106 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.Iijo7",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h37vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e6",
		"x-dtreferer" -> "${baseURL}/feelog/edit/${paymentId}",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_119 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.i/qS+",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h45vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e7",
		"x-dtreferer" -> "${baseURL}/feelog",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_120 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.n8bov",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h43vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e7",
		"x-dtreferer" -> "${baseURL}/feelog",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_121 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.kDk4s",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h46vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e7",
		"x-dtreferer" -> "${baseURL}/feelog",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_122 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.9LXkg",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h44vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e7",
		"x-dtreferer" -> "${baseURL}/feelog",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_136 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json",
		"csrf-token" -> "${csrfToken}",
		"origin" -> baseURL,
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.ZUQex",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h50vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e8",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_137 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.rmTPu",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h53vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e8",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_138 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.L3TxF",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h51vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e8",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_139 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.rBkvl",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h54vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e8",
		"x-requested-with" -> "XMLHttpRequest")

	val fee_clerk_headers_140 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|szlpy.VWJF+",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "1$76806346_784h52vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e8",
		"x-requested-with" -> "XMLHttpRequest")

	val feeClerkScenario = scenario("Fee Clerk Scenario")

	// Select 'add payment', enter details and click on 'add payment'
	.group("BAR${service}_030_AddPayment") {
		exec(http("BAR${service}_030_010_Cards")
			.post("/api/payment/cards")
			.headers(fee_clerk_headers_56)
			.body(StringBody("""{"amount":55000,"currency":"GBP","payer_name":"Mr Joe Smith","unallocated_amount":0,"withdrawReasonModel":{"reasons":[{"id":1,"reason":"Duplicate Entry"},{"id":2,"reason":"Fee not found"},{"id":3,"reason":"Other (add comment)"}]},"returnReasonModel":{"reasons":[{"id":1,"reason":"Overpayment"},{"id":2,"reason":"Incorrect payment amount"},{"id":3,"reason":"Other (add comment)"}]},"payment_type":{"id":"CARD","name":"Card"},"authorization_code":"654321"}"""))
			.check(jsonPath("$..id").saveAs("paymentId"))
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Click on 'Continue to Payment ID'
	.group("BAR${service}_040_PaymentID") {
		exec(http("BAR${service}_040_010_Features")
			.get("/api/features")
			.headers(fee_clerk_headers_62)
			.check(jsonPath("$..enable").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_040_020_PaymentInstructions1")
			.get("/api/payment-instructions/${paymentId}")
			.headers(fee_clerk_headers_63)
			.check(jsonPath("$..status").is("P"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_040_030_PaymentInstructions2")
			.get("/api/payment-instructions/${paymentId}/unallocated")
			.headers(fee_clerk_headers_64)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_040_040_PaymentAction1")
			.get("/api/payment-action")
			.headers(fee_clerk_headers_69)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_040_050_Jurisdiction1")
			.get("/api/fees/jurisdictions?jurisdiction=1")
			.headers(fee_clerk_headers_70)
			.check(jsonPath("$..found").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_040_060_PaymentAction2")
			.get("/api/payment-action")
			.headers(fee_clerk_headers_71)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_040_070_Jurisdiction2")
			.get("/api/fees/jurisdictions?jurisdiction=2")
			.headers(fee_clerk_headers_72)
			.check(jsonPath("$..found").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Enter case number and search for '550'
	.group("BAR${service}_050_Search") {
		exec(http("BAR${service}_050_010_Search")
			.get("/api/fees/search?query=550")
			.headers(fee_clerk_headers_76)
			.check(jsonPath("$..found").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Click on 'Save'
	.group("BAR${service}_060_Save") {
		exec(http("BAR${service}_060_010_PaymentInstructions1")
			.post("/api/payment-instructions/${paymentId}/fees")
			.headers(fee_clerk_headers_78)
			.body(StringBody("""{"showFixedAmount":100,"case_reference":"987","fee_code":"FEE0002","fee_description":"Filing an application for a divorce, nullity or civil partnership dissolution – fees order 1.2.","amount":55000,"fee_version":4,"feeType":"fixed","showEditableAmount":false,"payment_instruction_id":${paymentId}}"""))
			.check(jsonPath("$..amount").is("55000"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_020_PaymentInstructions2")
			.get("/api/payment-instructions/${paymentId}")
			.headers(fee_clerk_headers_79)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_030_PaymentInstructions3")
			.get("/api/payment-instructions/${paymentId}/unallocated")
			.headers(fee_clerk_headers_80)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Select 'Process' and click on 'Submit'
	.group("BAR${service}_070_Submit") {
		exec(http("BAR${service}_070_010_PaymentInstructions1")
			.put("/api/payment-instructions/${paymentId}")
			.headers(fee_clerk_headers_100)
			.body(StringBody("""{"status":"V","action":"Process"}"""))
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

			.exec(http("BAR${service}_070_020_PaymentInstructions2")
				.get("/api/payment-instructions/count?status=REJ")
				.headers(fee_clerk_headers_102)
				.check(jsonPath("$..success").is("true"))
				.check(status in(200, 304)))

			.exec(http("BAR${service}_070_030_PaymentInstructions3")
				.get("/api/payment-instructions/count?status=P")
				.headers(fee_clerk_headers_103)
				.check(jsonPath("$..success").is("true"))
				.check(status in(200, 304)))

			.exec(http("BAR${service}_070_040_PaymentInstructions4")
				.get("/api/payment-instructions?status=P,REJ")
				.headers(fee_clerk_headers_106)
				.check(jsonPath("$..success").is("true"))
				.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Click on 'Check and Submit'
	.group("BAR${service}_080_CheckAndSubmit") {
		exec(http("BAR${service}_080_010_Users1")
			.get("/api/users/${userId}/payment-instructions/stats?status=V")
			.headers(fee_clerk_headers_119)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

			.exec(http("BAR${service}_080_020_PaymentInstructions1")
				.get("/api/payment-instructions/count?userId=${userId}&status=PA&startDate=${date}&endDate=${date}")
				.headers(fee_clerk_headers_120)
				.check(jsonPath("$..success").is("true"))
				.check(status in(200, 304)))

			.exec(http("BAR${service}_080_030_Users2")
				.get("/api/users/${userId}/payment-instructions?status=V&action=Process")
				.headers(fee_clerk_headers_121)
				.check(jsonPath("$..success").is("true"))
				.check(status in(200, 304)))

			.exec(http("BAR${service}_080_040_Users3")
				.get("/api/users/${userId}/payment-instructions?status=V")
				.headers(fee_clerk_headers_122)
				.check(jsonPath("$..success").is("true"))
				.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Select submitted payment and click on 'Submit'
	.group("BAR${service}_090_SubmitPayment") {
		exec(http("BAR${service}_090_010_Cards")
			.post("/api/payment/cards")
			.headers(fee_clerk_headers_136)
			.body(StringBody("""{"amount":55000,"currency":"GBP","payer_name":"Mr Joe Smith","unallocated_amount":0,"withdrawReasonModel":{"reasons":[{"id":1,"reason":"Duplicate Entry"},{"id":2,"reason":"Fee not found"},{"id":3,"reason":"Other (add comment)"}]},"returnReasonModel":{"reasons":[{"id":1,"reason":"Overpayment"},{"id":2,"reason":"Incorrect payment amount"},{"id":3,"reason":"Other (add comment)"}]},"id":${paymentId},"payment_type":{"id":"CARD","name":"Card"},"status":"PA","action":"Process","authorization_code":"654321"}"""))
			.check(jsonPath("$..success").is("true"))
			.check(status in (200,304)))

		.exec(http("BAR${service}_090_020_Users1")
			.get("/api/users/${userId}/payment-instructions/stats?status=V")
			.headers(fee_clerk_headers_137)
			.check(jsonPath("$..success").is("true"))
			.check(status in (200,304)))

		.exec(http("BAR${service}_090_030_PaymentInstructions1")
			.get("/api/payment-instructions/count?userId=${userId}&status=PA&startDate=${date}&endDate=${date}")
			.headers(fee_clerk_headers_138)
			.check(jsonPath("$..success").is("true"))
			.check(status in (200,304)))

		.exec(http("BAR${service}_090_040_Users2")
			.get("/api/users/${userId}/payment-instructions?status=V&action=Process")
			.headers(fee_clerk_headers_139)
			.check(jsonPath("$..success").is("true"))
			.check(status in (200,304)))

		.exec(http("BAR${service}_090_050_Users3")
			.get("/api/users/${userId}/payment-instructions?status=V")
			.headers(fee_clerk_headers_140)
			.check(jsonPath("$..success").is("true"))
			.check(status in (200,304)))
	}

	.pause(thinkTime)

}