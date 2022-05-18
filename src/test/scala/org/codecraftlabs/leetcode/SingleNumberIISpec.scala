package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SingleNumberIISpec extends AnyFlatSpec with Matchers {
  "Given nums = [1, 1, 1, 3]" should "return 3" in {
    val nums = Array[Int](1, 1, 1, 3)
    SingleNumberII.singleNumber(nums) shouldEqual 3
  }

}
