import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.codecraftlabs",
      scalaVersion := "2.12.7",
      version      := "1.0.21.0"
    )),
    name := "leetcode-scala",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalacticTest % Test
  )
