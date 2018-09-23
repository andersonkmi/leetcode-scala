package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}

class LongestCommonPrefixSpec extends FlatSpec with Matchers {
  "Given two strings" should "car" in {
    val input = Array("cartoon", "carry")
    LongestCommonPrefix.longestCommonPrefix(input) shouldEqual "car"
  }

  "Given strings [flower,flow,flight]" should "return fl" in {
    val input = Array("flower", "flow", "flight")
    LongestCommonPrefix.longestCommonPrefix(input) shouldEqual "fl"
  }

  "Given one string" should "car" in {
    val input = Array("car")
    LongestCommonPrefix.longestCommonPrefix(input) shouldEqual "car"
  }

  "Given empty list" should "blank" in {
    val input = Array[String]()
    LongestCommonPrefix.longestCommonPrefix(input) shouldEqual ""
  }

  "Given strings [flower, car]" should "return blank" in {
    val input = Array("flower", "car")
    LongestCommonPrefix.longestCommonPrefix(input) shouldEqual ""
  }

}
