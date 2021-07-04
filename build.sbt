import Dependencies._

ThisBuild / scalaVersion     := "2.13.5"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example.com"

lazy val root = (project in file("."))
  .settings(
    name := "lambda-container-scala-example",
    libraryDependencies ++= Seq(
      lambdaRuntimeInterfaceClient,
      scalaTest % Test
    )
  ).settings(
    assembly / assemblyOutputPath := file("target/function.jar")
  )
