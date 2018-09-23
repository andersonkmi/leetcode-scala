package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}

class CountAndSaySpec extends FlatSpec with Matchers {
  "The CountAndSay.countAndSay(1)" should "return 1" in {
    CountAndSay.countAndSay(1) shouldEqual "1"
  }

  "The CountAndSay.countAndSay(2)" should "return 11" in {
    CountAndSay.countAndSay(2) shouldEqual "11"
  }

  "The CountAndSay.countAndSay(3)" should "return 21" in {
    CountAndSay.countAndSay(3) shouldEqual "21"
  }

  "The CountAndSay.countAndSay(4)" should "return 1211" in {
    CountAndSay.countAndSay(4) shouldEqual "1211"
  }

  "The CountAndSay.countAndSay(5)" should "return 111221" in {
    CountAndSay.countAndSay(5) shouldEqual "111221"
  }
}
