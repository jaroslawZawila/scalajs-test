package net.zawila.scalajs

import org.querki.jquery._
import org.singlespaced.d3js.Ops._
import org.singlespaced.d3js.d3

import scala.scalajs.js

object TutorialApp {

  def mains(args: Array[String]): Unit = {
    val graphHeight = 450

    //The width of each bar.
    val barWidth = 80

    //The distance between each bar.
    val barSeparation = 10

    //The maximum value of the data.
    val maxData = 50

    //The actual horizontal distance from drawing one bar rectangle to drawing the next.
    val horizontalBarDistance = barWidth + barSeparation

    //The value to multiply each bar's value by to get its height.
    val barHeightMultiplier = graphHeight / maxData;

    //Color for start
    val c = d3.rgb("DarkSlateBlue")

    val f1 = (d: Int, i: Int) => i * 100 + 30
    val f2 = (d: Int) => Math.sqrt(d)
    val rectHeightFun = (d: Int) => d * barHeightMultiplier
    val rectColorFun = (d: Int, i: Int) => c.brighter(i * 0.5).toString

    val svg = d3.select("body").append("svg").attr("width", "100%").attr("height", "450px")
    var circle = svg.selectAll("circle")
      .data(js.Array(32, 57, 112))

    var circleEnter = circle.enter().append("circle")

    circleEnter.attr("cy", 60)
    circleEnter.attr("cx", f1)
    circleEnter.attr("r", f2)

  }

  def addClickedMessage(): Unit = {
    $("body").append("<p>Hello World</p>")
  }

  def setupUI(): Unit = {
    $("body").append("<p>Hello World</p>")
    $("#click-me-button").click(() => addClickedMessage())
  }
}
