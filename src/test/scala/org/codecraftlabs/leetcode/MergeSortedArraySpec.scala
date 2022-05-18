package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MergeSortedArraySpec extends AnyFlatSpec with Matchers {
  "The MergeSortedArray " should "return 1 - 2" in {
    val nums1 = Array(1, 0)
    MergeSortedArray.merge(nums1, 1, Array(2), 1)
    nums1(0) shouldEqual 1
    nums1(1) shouldEqual 2
  }
}
