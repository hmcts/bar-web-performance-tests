package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.bar.scenarios.utils.Environment._

object DMClerkScenario extends Simulation {

	val DM_clerk_headers_50 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-id" -> "|cXfKu.ZxkJP",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h30vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e3",
		"x-dtreferer" -> s"${baseURL}/payment-overview",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_52 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-id" -> "|cXfKu.jrwUS",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h29vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e3",
		"x-dtreferer" -> s"${baseURL}/payment-overview",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_53 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-id" -> "|cXfKu.lhmjv",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h31vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e3",
		"x-dtreferer" -> s"${baseURL}/payment-overview",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_77 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.8G22+",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h36vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e5",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_91 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json",
		"csrf-token" -> "${csrfToken}",
		"origin" -> baseURL,
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.7fRis",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h39vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e6",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_93 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.pRDOD",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h41vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e6",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_94 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.SeJTb",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h40vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e6",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_111 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.l0SVZ",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h47vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_112 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.8XWu9",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h53vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_113 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.LxlOf",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h46vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_114 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.I46Jc",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h43vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_115 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.egLAT",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h50vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_116 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.FhIBp",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h54vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_117 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.yHDM/",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h48vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_118 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.h+eP2",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h52vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_119 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.L6pt1",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h51vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_120 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.NDs9U",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h45vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_121 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.iRiXu",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h44vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_122 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.KSACj",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h49vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e7",
		"x-dtreferer" -> "${baseURL}/users/${userId2}/payment-instructions/stats?status=A&fullName=krishna%20Srfeeclerk#Process/?status=A&paymentType=CARD&action=Process&bgcNumber=isNull",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_132 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.b9ca5",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h57vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e8",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_139 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.7AI2N",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h59vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e9",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_143 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.Qxkxc",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h61vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_145 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.E56vu",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h69vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_146 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.hvxcB",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h64vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_147 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.ohFwg",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h65vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_148 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.qnY8c",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h71vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_149 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.a1zoV",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h63vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_150 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.qPXVk",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h62vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_151 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.VZaCx",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h72vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_152 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.09skN",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h67vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_153 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.34rZB",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h68vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_154 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.tdtTX",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h66vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_155 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.RV+HH",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h70vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val DM_clerk_headers_156 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"csrf-token" -> "${csrfToken}",
		"request-context" -> "appId=cid-v1:${appId}",
		"request-id" -> "|cXfKu.59kPR",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"x-dtpc" -> "3$77030586_192h73vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e10",
		"x-requested-with" -> "XMLHttpRequest")

	val dmClerkScenario = scenario("DM Clerk Scenario")

	// Select 'krishna Srfeeclerk'
	.group("BAR${service}_030_SelectSeniorFeeClerk") {
		exec(http("BAR${service}_030_010_Users1")
			.get("/api/users/${userId2}/payment-instructions/stats?status=A")
			.headers(DM_clerk_headers_50)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_030_020_PaymentAction1")
			.get("/api/payment-action")
			.headers(DM_clerk_headers_52)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_030_030_PaymentAction2")
			.get("/api/payment-action")
			.headers(DM_clerk_headers_53)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Select 'Card'
	.group("BAR${service}_040_SelectCard") {
		exec(http("BAR${service}_040_010_Users")
			.get("/api/users/${userId2}/payment-instructions?status=A&paymentType=CARD&action=Process&bgcNumber=isNull")
			.headers(DM_clerk_headers_77)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Select payment and click on 'approve'
	.group("BAR${service}_050_Approve") {
		exec(http("BAR${service}_050_010_Payment")
			.post("/api/payment/cards")
			.headers(DM_clerk_headers_91)
			.body(StringBody("""{"amount":55000,"currency":"GBP","payer_name":"Mr Joe Smith","unallocated_amount":0,"withdrawReasonModel":{"reasons":[{"id":1,"reason":"Duplicate Entry"},{"id":2,"reason":"Fee not found"},{"id":3,"reason":"Other (add comment)"}]},"returnReasonModel":{"reasons":[{"id":1,"reason":"Overpayment"},{"id":2,"reason":"Incorrect payment amount"},{"id":3,"reason":"Other (add comment)"}]},"id":${paymentId},"payment_type":{"id":"CARD","name":"Card"},"status":"TTB","action":"Process","authorization_code":"654321"}"""))
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_050_020_Users1")
			.get("/api/users/${userId2}/payment-instructions/stats?status=A")
			.headers(DM_clerk_headers_93)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_050_030_Users2")
			.get("/api/users/${userId2}/payment-instructions?status=A&paymentType=CARD&action=Process&bgcNumber=isNull")
			.headers(DM_clerk_headers_94)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Select 'Manage HMCTS Payments'
	.group("BAR${service}_060_ManageHMCTSPayments") {
		exec(http("BAR${service}_060_010_PaymentInstructions1")
			.get("/api/payment-instructions/count?status=C&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_111)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_020_Users1")
			.get("/api/users/pi-stats?status=A")
			.headers(DM_clerk_headers_112)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_030_PaymentInstructions2")
			.get("/api/payment-instructions/count?status=TTB&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_113)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_040_Users2")
			.get("/api/users/${userId1}/payment-instructions?status=PA")
			.headers(DM_clerk_headers_114)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_050_PaymentInstructions3")
			.get("/api/payment-instructions/count?status=PA")
			.headers(DM_clerk_headers_115)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_060_Users3")
			.get("/api/users/pi-stats/count?status=D&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_116)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_070_070_PaymentInstructions4")
			.get("/api/payment-instructions/count?status=P")
			.headers(DM_clerk_headers_117)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_080_Users4")
			.get("/api/users/pi-stats?status=TTB")
			.headers(DM_clerk_headers_118)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_090_PaymentInstructions5")
			.get("/api/payment-instructions/count?status=STP&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_119)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_100_PaymentInstructions6")
			.get("/api/payment-instructions/count?status=D&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_120)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_110_PaymentInstructions7")
			.get("/api/payment-instructions/count?status=V&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_121)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_060_120_PaymentInstructions8")
			.get("/api/payment-instructions/count?status=A")
			.headers(DM_clerk_headers_122)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Filter by 'Transfer to BAR' and click on 'Submit'
	.group("BAR${service}_070_Submit") {
		exec(http("BAR${service}_070_010_CurrentTime")
			.get("/api/current-time")
			.headers(DM_clerk_headers_132)
			.check(jsonPath("$..currentTime").saveAs("currentTime"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

	// Click on 'Confirm'
	.group("BAR${service}_080_Confirm") {
		exec(http("BAR${service}_080_010_PaymentInstructions1")
			.get("/api/payment-instructions/send-to-payhub/${currentTime}")
			.headers(DM_clerk_headers_139)
			.check(jsonPath("$..success").is("1"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_020_Users1")
			.get("/api/users/${userId1}/payment-instructions?status=PA")
			.headers(DM_clerk_headers_143)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_030_PaymentInstructions2")
			.get("/api/payment-instructions/count?status=STP&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_145)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_040_PaymentInstructions3")
			.get("/api/payment-instructions/count?status=TTB&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_146)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_050_PaymentInstructions4")
			.get("/api/payment-instructions/count?status=C&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_147)
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_060_Users2")
			.get("/api/users/pi-stats?status=A")
			.headers(DM_clerk_headers_148)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_070_PaymentInstructions5")
			.get("/api/payment-instructions/count?status=D&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_149)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_080_PaymentInstructions6")
			.get("/api/payment-instructions/count?status=V&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_150)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_090_Users3")
			.get("/api/users/pi-stats/count?status=D&startDate=${date}&endDate=${date}")
			.headers(DM_clerk_headers_151)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_100_PaymentInstructions7")
			.get("/api/payment-instructions/count?status=A")
			.headers(DM_clerk_headers_152)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_110_PaymentInstructions8")
			.get("/api/payment-instructions/count?status=PA")
			.headers(DM_clerk_headers_153)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_120_PaymentInstructions9")
			.get("/api/payment-instructions/count?status=P")
			.headers(DM_clerk_headers_154)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_130_Users4")
			.get("/api/users/pi-stats?status=TTB")
			.headers(DM_clerk_headers_155)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))

		.exec(http("BAR${service}_080_140_Users5")
			.get("/api/users/pi-stats?status=TTB")
			.headers(DM_clerk_headers_156)
			.check(jsonPath("$..success").is("true"))
			.check(status in(200, 304)))
	}

	.pause(thinkTime)

}