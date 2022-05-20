package org.codecraftlabs.training

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RationalSpec extends AnyFlatSpec with Matchers {
  "1/2 + 2/3" should "7/6" in {
    val r1 = new Rational(1, 2)
    val r2 = new Rational(2, 3)

    val result = r1.add(r2)
    result.numer shouldEqual 7
    result.denom shouldEqual 6
  }

  "1/3 lessThan 1/2" should "return true" in {
    val r1 = new Rational(1, 3)
    val r2 = new Rational(1, 2)

    r1.lessThan(r2) shouldEqual true
  }
}
