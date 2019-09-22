package org.codecraftlabs.leetcode

object SingleNumberII {
  def singleNumber(nums: Array[Int]): Int = {
    nums.groupBy(l => l).view.mapValues(_.length).filter(p => p._2 == 1).keys.head
  }
}
