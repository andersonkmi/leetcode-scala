package org.codecraftlabs.utils

import org.codecraftlabs.utils.NumberConverter.decimal2Binary
import org.scalatest.{FlatSpec, Matchers}

class NumberConverterSpec extends FlatSpec with Matchers {
  "0" should "return 0" in {
    decimal2Binary(0) shouldEqual "0"
  }

  "1" should "return 1" in {
    decimal2Binary(1) shouldEqual "1"
  }

  "2" should "return 10" in {
    decimal2Binary(2) shouldEqual "10"
  }

  "4" should "return 100" in {
    decimal2Binary(4) shouldEqual "100"
  }
}
