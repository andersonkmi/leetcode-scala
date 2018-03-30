package org.sharpsw.leetcode

import org.scalatest.{FlatSpec, Matchers}

class SingleNumberIISpec extends FlatSpec with Matchers {
  "Given nums = [1, 1, 1, 3]" should "return 3" in {
    val nums = Array[Int](1, 1, 1, 3)
    SingleNumberII.singleNumber(nums) shouldEqual 3
  }

}
