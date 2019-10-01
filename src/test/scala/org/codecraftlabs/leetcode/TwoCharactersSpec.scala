package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}

class TwoCharactersSpec extends FlatSpec with Matchers {

  "beabeefeab" should "return 5" in {
    TwoCharacters.alternate("beabeefeab") shouldEqual 5
  }
}
