package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ValidPalindromeSpec extends AnyFlatSpec with Matchers {
  "Empty string" should "return true" in {
    ValidPalindrome.isPalindrome("") shouldEqual true
  }

  "The string 'A man, a plan, a canal: Panama'" should "return true" in {
    ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama") shouldEqual true
  }

  "The string 'race a car'" should "return false" in {
    ValidPalindrome.isPalindrome("race a car") shouldEqual false
  }

  "The string '0P'" should "return false" in {
    ValidPalindrome.isPalindrome("0P") shouldEqual false
  }

  "Null string" should "return true" in {
    ValidPalindrome.isPalindrome(null) shouldEqual true
  }
}
