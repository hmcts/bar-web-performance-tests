package uk.gov.hmcts.bar.scenarios.utils


import io.gatling.core.Predef._
import io.gatling.http.Predef._


object Environment {

  val idamURL = "https://idam-web-public.aat.platform.hmcts.net/login"
  val baseURL = "https://bar-web-aat.service.core-compute-aat.internal"

  val minThinkTime = 6
  val maxThinkTime = 10
  val constantthinkTime = 1
  val minWaitForNextIteration = 1
  val maxWaitForNextIteration = 2


  val HttpProtocol = http

  val commonHeader = Map(
    "CSRF-Token" -> "${CSRF_TOKEN}")

  val createSubHeader = Map(
    "CSRF-Token" -> "${CSRF_TOKEN}",
    "Content-Type" -> "application/json")
}