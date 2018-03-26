package org.sharpsw.leetcode

import org.scalatest.{FlatSpec, Matchers}

class LengthLastWordSpec extends FlatSpec with Matchers {
  "The LengthLastWord" should "return 0" in {
    LengthLastWord.lengthOfLastWord("") shouldEqual 0
  }

  "The LengthLastWord" should "return 3" in {
    LengthLastWord.lengthOfLastWord("car") shouldEqual 3
  }

  "The LengthLastWord" should "return 3 using preceding spaces" in {
    LengthLastWord.lengthOfLastWord("    car") shouldEqual 3
  }

  "The LengthLastWord" should "return 3 with trailing spaces" in {
    LengthLastWord.lengthOfLastWord("car    ") shouldEqual 3
  }

  "The LengthLastWord" should "return 4" in {
    LengthLastWord.lengthOfLastWord("car test") shouldEqual 4
  }

  "The LengthLastWord" should "return 4 with trailing spaces" in {
    LengthLastWord.lengthOfLastWord("car test     ") shouldEqual 4
  }
}
