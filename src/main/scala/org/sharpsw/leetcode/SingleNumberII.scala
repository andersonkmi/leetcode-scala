package org.sharpsw.leetcode

object SingleNumberII {
  def singleNumber(nums: Array[Int]): Int = {
    nums.groupBy(l => l).mapValues(_.size).filter(p => p._2 == 1).keys.head
  }
}
