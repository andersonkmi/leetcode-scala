package org.codecraftlabs.leetcode

object ContainsDuplicate {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    if (nums.isEmpty) {
      false
    } else {
      nums.groupBy(identity).mapValues(_.length).exists(item => item._2 > 1)
    }
  }
}
