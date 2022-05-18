package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SingleNumberIIISpec extends AnyFlatSpec with Matchers {
  "Given nums = [1, 2, 1, 3, 2, 5]" should "return [3, 5]" in {
    val nums = Array[Int](1, 2, 1, 3, 2, 5)
    val result = SingleNumberIII.singleNumber(nums).sorted
    result should have length 2
    result should be (Array(3, 5))
  }
}
