package org.codecraftlabs.leetcode

object SingleNumberIII {
  def singleNumber(nums: Array[Int]): Array[Int] = {
    nums.groupBy(l => l).view.mapValues(_.length).filter(p => p._2 == 1).keys.toArray
  }
}
