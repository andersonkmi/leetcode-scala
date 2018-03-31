package org.sharpsw.leetcode

import org.scalatest.{FlatSpec, Matchers}

class ValidPalindromeSpec extends FlatSpec with Matchers {
  "Empty string" should "return true" in {
    ValidPalindrome.isPalindrome("") shouldEqual true
  }
}
