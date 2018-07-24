package net.zawila.scalajs

import scalatags.Text.all._


object RequestExample {

  val boot =
    "net.zawila.scalajs.Client().mains(document.getElementById('contents'))"
  val skeleton =
    html(
      head(
        script(src:="/target/scala-2.12/scalajs-test-jsdeps.js"),
        link(
          rel:="stylesheet",
          href:="https://cdnjs.cloudflare.com/ajax/libs/pure/0.5.0/pure-min.css"
        )
      ),
      body(
        onload:=boot,
        div(id:="contents")
      )
    )

}
