package org.sharpsw.leetcode

object SingleNumberIII {
  def singleNumber(nums: Array[Int]): Array[Int] = {
    nums.groupBy(l => l).mapValues(_.length).filter(p => p._2 == 1).keys.toArray
  }
}
