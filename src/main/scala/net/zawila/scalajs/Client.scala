package net.zawila.scalajs

import fr.hmil.roshttp.HttpRequest
import monix.execution.Scheduler.Implicits.global
import org.scalajs.dom
import org.scalajs.dom.raw.Node
import scalatags.JsDom.all._

import scala.scalajs.js
import scala.scalajs.js.JSON
import scala.scalajs.js.annotation.JSExport


@JSExport
object Client {

  @JSExport
  def main(args: Array[String]): Unit = {
    print("start")
    val request = HttpRequest("https://www.gov.uk/bank-holidays.json")
    request.get().foreach {res =>
      print("here")
      val json: js.Dynamic = JSON.parse(res.body.toString)
      json
      dom.document.body.appendChild(
        div(
          h1()
        ).render)
    }
    print("finish")
  }
}
