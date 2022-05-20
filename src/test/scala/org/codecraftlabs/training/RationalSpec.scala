package org.codecraftlabs.training

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RationalSpec extends AnyFlatSpec with Matchers {
  "1/2 + 2/3" should "7/6" in {
    val r1 = new Rational(1, 2)
    val r2 = new Rational(2, 3)

    val result = r1 + r2
    result.numer shouldEqual 7
    result.denom shouldEqual 6
  }

  "1/3 * 1/6" should "result in 2" in {
    val r1 = new Rational(1, 3)
    val r2 = new Rational(1, 6)

    val result = r1 * r2
    result.numer shouldEqual 2
    result.denom shouldEqual 1
  }

  "1/3 lessThan 1/2" should "return true" in {
    val r1 = new Rational(1, 3)
    val r2 = new Rational(1, 2)

    r1.lessThan(r2) shouldEqual true
  }

  "Rational 2" should "be 2/1" in {
    val rational = new Rational(2)

    rational.numer shouldEqual 2
    rational.denom shouldEqual 1
  }

  "Initial value 3/6" should "be converted to 1/2" in {
    val rational = new Rational(3, 6)

    rational.numer shouldEqual 1
    rational.denom shouldEqual 2
  }
}
