package uk.gov.hmcts.bar.scenarios.utils

import java.time.format.DateTimeFormatter
import java.time.LocalDate

object Environment {

  val env = "aat"
  val baseURL = "https://bar." + env + ".platform.hmcts.net"
  val idamURL = "https://idam-web-public." + env + ".platform.hmcts.net"
  val baseDomain = "bar." + env + ".platform.hmcts.net"
  val idamDomain = "idam-web-public." + env + ".platform.hmcts.net"

  val format = DateTimeFormatter.ofPattern("ddMMyyyy")
  val date = LocalDate.now().format(format)

  val thinkTime = 10

}