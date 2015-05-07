name := "ScalaExamples"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "2.4.13" % "test"
)

scalacOptions += "-feature"