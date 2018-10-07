package org.codecraftlabs.leetcode

import org.codecraftlabs.leetcode.JewelsAndStones.numJewelsInStones
import org.scalatest.{FlatSpec, Matchers}

class JewelsAndStonesSpec extends FlatSpec with Matchers {
  it should "return 3 with jewels = 'aA' and stones = 'aAAbbbb'" in {
    val jewels = "aA"
    val stones = "aAAbbbb"
    numJewelsInStones(jewels, stones) shouldEqual 3
  }

  it should "return 0 with jewels = 'c' and stones = 'aAAbbbb'" in {
    val jewels = "c"
    val stones = "aAAbbbb"
    numJewelsInStones(jewels, stones) shouldEqual 0
  }
}
