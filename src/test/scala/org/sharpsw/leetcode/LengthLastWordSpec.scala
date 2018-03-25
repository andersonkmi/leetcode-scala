package org.sharpsw.leetcode

import org.scalatest._

class LengthLastWordSpec extends FlatSpec with Matchers {
  "The LengthLastWord" should "return 0" in {
    LengthLastWord.lengthOfLastWord("") shouldEqual 0
  }
}
