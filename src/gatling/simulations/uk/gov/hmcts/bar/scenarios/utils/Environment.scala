package uk.gov.hmcts.bar.scenarios.utils


import io.gatling.core.Predef._
import io.gatling.http.Predef._


object Environment {

  //Test Enviornment
  //val idamURL = "https://idam-web-public.aat.platform.hmcts.net/login"
  //val baseURL = "https://bar-web-aat.service.core-compute-aat.internal"

  //PerfTest enviornment
  val idamURL = "https://idam-web-public.perftest.platform.hmcts.net/login"
  val baseURL = "https://bar-web-perftest.service.core-compute-perftest.internal"

  val minThinkTime = 8
  val maxThinkTime = 12
  val constantthinkTime = 1
  val minWaitForNextIteration = 1
  val maxWaitForNextIteration = 2

  val SFCminThinkTime = 5
  val SFCmaxThinkTime = 12
  val SFCconstantthinkTime = 1
  val SFCminWaitForNextIteration = 1
  val SFCmaxWaitForNextIteration = 2

  val DMminThinkTime = 5
  val DMmaxThinkTime = 12
  val DMconstantthinkTime = 1
  val DMminWaitForNextIteration = 1
  val DMmaxWaitForNextIteration = 2

  val HttpProtocol = http

  val commonHeader = Map(
    "CSRF-Token" -> "${CSRF_TOKEN}")

  val createSubHeader = Map(
    "CSRF-Token" -> "${CSRF_TOKEN}",
    "Content-Type" -> "application/json")
}