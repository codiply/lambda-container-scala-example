package com.example

import java.util.{ Map => JavaMap }
import com.amazonaws.lambda.thirdparty.com.google.gson.GsonBuilder
import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}

class LambdaHandler() extends RequestHandler[JavaMap[String, String], String] {
  val gson = new GsonBuilder().setPrettyPrinting.create

  override def handleRequest(event: JavaMap[String, String], context: Context): String = {
    val logger = context.getLogger

    logger.log(s"ENVIRONMENT VARIABLES: ${gson.toJson(System.getenv)}\n")
    logger.log(s"CONTEXT: ${gson.toJson(context)}\n")

    logger.log(s"EVENT: ${gson.toJson(event)}\n")

    "Hello from Scala!"
  }
}
