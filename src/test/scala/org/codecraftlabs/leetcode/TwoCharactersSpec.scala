package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TwoCharactersSpec extends AnyFlatSpec with Matchers {

  "beabeefeab" should "return 5" in {
    TwoCharacters.alternate("beabeefeab") shouldEqual 5
  }
}
