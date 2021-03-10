package uk.gov.hmcts.bar.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import uk.gov.hmcts.bar.scenarios.utils.Environment._

object LoginScenario {

  val fee_clerk_headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "cache-control" -> "max-age=0",
    "origin" -> idamURL,
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val fee_clerk_headers_22 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76806346_784h4vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e2",
    "x-requested-with" -> "XMLHttpRequest")

  val fee_clerk_headers_29 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76806346_784h11vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val fee_clerk_headers_31 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76806346_784h5vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e2",
    "x-requested-with" -> "XMLHttpRequest")

  val fee_clerk_headers_33 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76806346_784h10vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val fee_clerk_headers_36 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76806346_784h9vMRPMMAFSUBRKCHBKANPKCGCKPIRHWAQF-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "cache-control" -> "max-age=0",
    "origin" -> idamURL,
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val senior_fee_clerk_headers_21 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h18vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_24 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h9vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_25 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h17vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_26 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h11vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_29 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h20vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_30 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h10vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_31 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h19vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_33 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h14vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_34 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h16vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_35 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h4vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_38 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h15vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_39 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h5vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_41 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h12vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val senior_fee_clerk_headers_45 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "1$76947012_908h13vWFMHKRRUAARFVCISGRHIJIPLCMNCIVSU-0e2",
    "x-dtreferer" -> "${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "cache-control" -> "max-age=0",
    "origin" -> idamURL,
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val DM_clerk_headers_23 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h14vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_28 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h9vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_29 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h10vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_30 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h18vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_32 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h15vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_34 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h19vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_35 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h11vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_36 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h13vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_37 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h16vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_38 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h17vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_39 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h4vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_40 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h20vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_41 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h12vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-dtreferer" -> s"${baseURL}/",
    "x-requested-with" -> "XMLHttpRequest")

  val DM_clerk_headers_42 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "csrf-token" -> "${csrfToken}",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "same-origin",
    "x-dtpc" -> "3$77030586_192h5vACQLQPHRNURPGSMEPUCKBSAVKMNHNGBF-0e2",
    "x-requested-with" -> "XMLHttpRequest")

  val logout_headers_1 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val Homepage = scenario("Homepage")

  .exec(_.setAll(("date", date), ("baseURL", baseURL)))

  // Homepage
  .group("BAR${service}_010_Homepage") {
    exec(http("BAR${service}_010_010_Homepage")
      .get("/")
      .check(regex("""code&state=(.*)&client_id""").saveAs("state"))
      .check(css("input[name='_csrf']", "value").saveAs("csrfLogin"))
      .check(status in(200, 304)))
  }

  .pause(thinkTime)

  val FeeClerkLogin = scenario("Fee Clerk Login Scenario")

  // Log in
  .group("BAR${service}_020_Login") {
    exec(http("BAR${service}_020_010_Login")
      .post(idamURL + "/login?response_type=code&state=${state}&client_id=bar_frontend&redirect_uri=https%3A%2F%2F" + baseDomain + "%2Foauth2%2Fcallback")
      .headers(fee_clerk_headers_0)
      .formParam("username", "${FCUserName}")
      .formParam("password", "${FCUserPWD}")
      .formParam("save", "Sign in")
      .formParam("selfRegistrationEnabled", "true")
      .formParam("_csrf", "${csrfLogin}")
      .check(regex("""<meta name="csrf-token" content="(.*?)"><title>""").find(0).saveAs("csrfToken"))
      .check(headerRegex("request-context", "appId=cid-v1:(.*?)").saveAs("appId"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_020_PaymentTypes1")
      .get("/api/payment-types")
      .headers(fee_clerk_headers_22)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_030_PaymentInstructions1")
      .get("/api/payment-instructions/count?status=REJ")
      .headers(fee_clerk_headers_29)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_040_PaymentTypes2")
      .get("/api/payment-types")
      .headers(fee_clerk_headers_31)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_050_PaymentInstructions2")
      .get("/api/payment-instructions/count?status=P")
      .headers(fee_clerk_headers_33)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_060_PaymentInstructions3")
      .get("/api/payment-instructions?status=P,REJ")
      .headers(fee_clerk_headers_36)
      .check(jsonPath("$..barUserId").saveAs("userId"))
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))
  }

  .pause(thinkTime)

  val seniorFeeClerkLogin = scenario("Senior Fee Clerk Login Scenario")

  // Log in
  .group("BAR${service}_020_Login") {
    exec(http("BAR${service}_020_010_Login")
      .post(idamURL + "/login?response_type=code&state=${state}&client_id=bar_frontend&redirect_uri=https%3A%2F%2F" + baseDomain + "%2Foauth2%2Fcallback")
      .headers(senior_fee_clerk_headers_0)
      .formParam("username", "${SrFeeClerkUserName}")
      .formParam("password", "${SrFeeClerkUserPWD}")
      .formParam("save", "Sign in")
      .formParam("selfRegistrationEnabled", "true")
      .formParam("_csrf", "${csrfLogin}")
      .check(regex("""<meta name="csrf-token" content="(.*?)"><title>""").find(0).saveAs("csrfToken"))
      .check(headerRegex("request-context", "appId=cid-v1:(.*?)").saveAs("appId"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_020_Users1")
      .get("/api/users/pi-stats?status=RDM&oldStatus=A")
      .headers(senior_fee_clerk_headers_21)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_030_Users2")
      .get("/api/users/104796/payment-instructions?status=PA")
      .headers(senior_fee_clerk_headers_24)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_040_PaymentInstructions1")
      .get("/api/payment-instructions/count?status=STP&startDate=${date}&endDate=${date}")
      .headers(senior_fee_clerk_headers_25)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_050_PaymentInstructions2")
      .get("/api/payment-instructions/count?status=D&startDate=${date}&endDate=${date}")
      .headers(senior_fee_clerk_headers_26)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_060_Users3")
      .get("/api/users/pi-stats/count?status=D&startDate=${date}&endDate=${date}")
      .headers(senior_fee_clerk_headers_29)
      .check(jsonPath("$..bar_user_id").saveAs("userId"))
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_070_PaymentInstructions3")
      .get("/api/payment-instructions/count?status=V&startDate=${date}&endDate=${date}")
      .headers(senior_fee_clerk_headers_30)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_080_Users4")
      .get("/api/users/pi-stats?status=PA")
      .headers(senior_fee_clerk_headers_31)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_090_PaymentInstructions4")
      .get("/api/payment-instructions/count?status=P")
      .headers(senior_fee_clerk_headers_33)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_100_PaymentInstructions5")
      .get("/api/payment-instructions/count?status=PA")
      .headers(senior_fee_clerk_headers_34)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_110_PaymentTypes1")
      .get("/api/payment-types")
      .headers(senior_fee_clerk_headers_35)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_120_PaymentInstructions6")
      .get("/api/payment-instructions/count?status=A")
      .headers(senior_fee_clerk_headers_38)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_130_PaymentTypes2")
      .get("/api/payment-types")
      .headers(senior_fee_clerk_headers_39)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_140_PaymentInstructions7")
      .get("/api/payment-instructions/count?status=TTB&startDate=${date}&endDate=${date}")
      .headers(senior_fee_clerk_headers_41)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_150_PaymentInstructions8")
      .get("/api/payment-instructions/count?status=C&startDate=${date}&endDate=${date}")
      .headers(senior_fee_clerk_headers_45)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))
  }

  .pause(thinkTime)

  val DMClerkLogin = scenario("DM Clerk Login Scenario")

  // Log in
  .group("BAR${service}_020_Login") {
    exec(http("BAR${service}_020_010_Login")
      .post(idamURL + "/login?response_type=code&state=${state}&client_id=bar_frontend&redirect_uri=https%3A%2F%2F" + baseDomain + "%2Foauth2%2Fcallback")
      .headers(DM_clerk_headers_0)
      .formParam("username", "${DMUserName}")
      .formParam("password", "${DMUserPWD}")
      .formParam("save", "Sign in")
      .formParam("selfRegistrationEnabled", "true")
      .formParam("_csrf", "${csrfLogin}")
      .check(regex("""<meta name="csrf-token" content="(.*?)"><title>""").find(0).saveAs("csrfToken"))
      .check(headerRegex("set-cookie", "__user-info=%7B%22id%22%3A%22(.*?)%22%2C%22").saveAs("userId1"))
      .check(headerRegex("request-context", "appId=cid-v1:(.*?)").saveAs("appId"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_020_PaymentInstructions1")
      .get("/api/payment-instructions/count?status=P")
      .headers(DM_clerk_headers_23)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_030_Users1")
      .get("/api/users/${userId1}/payment-instructions?status=PA")
      .headers(DM_clerk_headers_28)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_040_PaymentInstructions2")
      .get("/api/payment-instructions/count?status=V&startDate=${date}&endDate=${date}")
      .headers(DM_clerk_headers_29)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_050_Users2")
      .get("/api/users/pi-stats?status=TTB")
      .headers(DM_clerk_headers_30)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_060_PaymentInstructions3")
      .get("/api/payment-instructions/count?status=A")
      .headers(DM_clerk_headers_32)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_070_Users3")
      .get("/api/users/pi-stats?status=A")
      .headers(DM_clerk_headers_34)
      .check(jsonPath("$..bar_user_id").find(0).saveAs("userId2"))
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_080_PaymentInstructions4")
      .get("/api/payment-instructions/count?status=D&startDate=${date}&endDate=${date}")
      .headers(DM_clerk_headers_35)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_090_PaymentInstructions5")
      .get("/api/payment-instructions/count?status=C&startDate=${date}&endDate=${date}")
      .headers(DM_clerk_headers_36)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_100_PaymentInstructions6")
      .get("/api/payment-instructions/count?status=PA")
      .headers(DM_clerk_headers_37)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_110_PaymentInstructions7")
      .get("/api/payment-instructions/count?status=STP&startDate=${date}&endDate=${date}")
      .headers(DM_clerk_headers_38)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_120_PaymentTypes1")
      .get("/api/payment-types")
      .headers(DM_clerk_headers_39)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_130_Users4")
      .get("/api/users/pi-stats/count?status=D&startDate=${date}&endDate=${date}")
      .headers(DM_clerk_headers_40)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_140_PaymentInstructions8")
      .get("/api/payment-instructions/count?status=TTB&startDate=${date}&endDate=${date}")
      .headers(DM_clerk_headers_41)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))

    .exec(http("BAR${service}_020_150_PaymentTypes2")
      .get("/api/payment-types")
      .headers(DM_clerk_headers_42)
      .check(jsonPath("$..success").is("true"))
      .check(status in(200, 304)))
  }

  .pause(thinkTime)

  val Logout = scenario("Logout")

  // Log out
  .group("BAR${service}_${SignoutNumber}_Logout") {
    exec(http("BAR${service}_${SignoutNumber}_010_Logout1")
      .get("/logout")
      .headers(logout_headers_1)
      .check(regex("This page cannot be found"))
      .check(status.is(404)))

  }

}
