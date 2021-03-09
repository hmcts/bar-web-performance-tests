package uk.gov.hmcts.bar.scenarios.utils

object Feeders {

  val FeeClerkFeeder = Iterator.continually(Map("service" -> ({
    "FeeClerk"
  }),
    "SignoutNumber" -> ({
      "100"
    })

  ));

  val SeniorFeeClerkFeeder = Iterator.continually(Map("service" -> ({
    "SeniorFeeClerk"
  }),
    "SignoutNumber" -> ({
      "060"
    })

  ));

  val DMClerkFeeder = Iterator.continually(Map("service" -> ({
    "DMClerk"
  }),
    "SignoutNumber" -> ({
      "090"
    })
  ));

}
