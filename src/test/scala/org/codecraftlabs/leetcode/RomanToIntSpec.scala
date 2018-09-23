package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}
import RomanToInt.romanToInt

class RomanToIntSpec extends FlatSpec with Matchers {
  "III" should "return 3" in {
    romanToInt("III") shouldEqual 3
  }

  "IV" should "return 4" in {
    romanToInt("IV") shouldEqual 4
  }

  "VI" should "return 6" in {
    romanToInt("VI") shouldEqual 6
  }

  "LVIII" should "return 58" in {
    romanToInt("LVIII") shouldEqual 58
  }

  "MCMXCIV" should "return 1994" in {
    romanToInt("MCMXCIV") shouldEqual 1994
  }
}
