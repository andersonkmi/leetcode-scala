package org.sharpsw.leetcode

import scala.Int.MinValue

object MaximumSubarray {
  def maxSubArray(nums: Array[Int]): Int = {
    generateNumbersCombinations(nums)
  }

  private def generateNumbersCombinations(numbers: Array[Int]): Int = {
    var maxValue = MinValue
    for(idx <- 0 to numbers.length) {
      for(idx2 <- idx + 1 to numbers.length) {
        val currentSum = numbers.slice(idx, idx2).sum
        if(currentSum > maxValue) maxValue = currentSum
      }
    }
    maxValue
  }
}
