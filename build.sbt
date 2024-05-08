enablePlugins(GatlingPlugin, FrontLinePlugin)

name := "PostmanRegister"

version := "0.1.0T"

scalaVersion := "3.3.3"

scalacOptions := Seq(
  "-encoding",
  "UTF-8",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-language:implicitConversions",
  "-language:postfixOps"
)

val GatlingVersion = "3.11.2"

libraryDependencies += "io.gatling" % "gatling-test-framework" % GatlingVersion
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % GatlingVersion




