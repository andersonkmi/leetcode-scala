import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version      := "1.0.12.0"
    )),
    name := "leetcode-scala",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalacticTest % Test
  )
