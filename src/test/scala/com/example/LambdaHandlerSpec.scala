package com.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LambdaHandlerSpec extends AnyFlatSpec with Matchers {
  "handleRequest" should "do something interesting" in {
    1 shouldBe 1
  }
}
