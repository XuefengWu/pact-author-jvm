package com.dius.pact.author

import com.dius.pact.model._

object Fixtures {
  val provider = Provider("test provider")
  val consumer = Consumer("test consumer")

  val request = Request("GET", "/",
    Some(Map("testreqheader" -> "testreqheadervalue")),
    Some("""{"test":true}"""))

  val response = Response(200,
    Some(Map("testreqheader" -> "testreqheaderval")),
    Some("""{"responsetest":true}"""))

  val interaction = Interaction(
    description = "test interaction",
    providerState = "test state",
    request = request,
    response = response
  )

  val interactions = Seq(interaction)

  val pact:Pact = Pact(
    provider = provider,
    consumer = consumer,
    interactions = interactions
  )
}
