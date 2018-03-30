package org.sharpsw.leetcode

import org.scalatest.{FlatSpec, Matchers}

class SingleNumberIIISpec extends FlatSpec with Matchers {
  "Given nums = [1, 2, 1, 3, 2, 5]" should "return [3, 5]" in {
    val nums = Array[Int](1, 2, 1, 3, 2, 5)
    val result = SingleNumberIII.singleNumber(nums).sorted
    result should have length 2
    result should be (Array(3, 5))
  }
}
