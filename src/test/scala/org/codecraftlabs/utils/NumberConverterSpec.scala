package org.codecraftlabs.utils

import org.codecraftlabs.utils.NumberConverter.{binary2Decimal, decimal2Binary}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class NumberConverterSpec extends AnyFlatSpec with Matchers {
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

  "binary 0" should "return 0" in {
    binary2Decimal("0") shouldEqual 0
  }

  "binary 1" should "return 1" in {
    binary2Decimal("1") shouldEqual 1
  }

  "binary 10" should "return 2" in {
    binary2Decimal("10") shouldEqual 2
  }

  "binary 11" should "return 3" in {
    binary2Decimal("11") shouldEqual 3
  }

  "binary 100" should "return 4" in {
    binary2Decimal("100") shouldEqual 4
  }
}
