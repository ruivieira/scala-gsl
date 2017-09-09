enablePlugins(ScalaNativePlugin)

organization := "org.ruivieira"

name := "scala-gsl"

version := "0.0.1"

scalaVersion := "2.11.11"

libraryDependencies += "com.lihaoyi" %% "utest" % "0.4.7" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")