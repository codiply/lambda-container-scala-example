import sbt._

object Dependencies {
  lazy val lambdaRuntimeInterfaceClient = "com.amazonaws" % "aws-lambda-java-runtime-interface-client" % "1.1.0"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.8"
}
