name := "scalajs-test"

version := "0.1"

scalaVersion := "2.12.6"

enablePlugins(ScalaJSPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.querki" %%% "jquery-facade" % "1.2",
  "org.singlespaced" %%% "scalajs-d3" % "0.3.4",
  "fr.hmil" %%% "roshttp" % "2.1.0",
  "com.lihaoyi" %%% "scalatags" % "0.6.2",
  "org.webjars" % "bootstrap" % "3.2.0"

)

skip in packageJSDependencies := false

jsDependencies += "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"