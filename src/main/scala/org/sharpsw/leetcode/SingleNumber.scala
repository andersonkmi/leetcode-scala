package org.sharpsw.leetcode

object SingleNumber {
  def singleNumber(nums: Array[Int]): Int = {
    nums.groupBy(l => l).mapValues(_.size).filter(p => p._2 == 1).keys.head
  }
}
