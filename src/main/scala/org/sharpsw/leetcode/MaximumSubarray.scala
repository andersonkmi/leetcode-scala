package org.sharpsw.leetcode

import scala.collection.mutable.ListBuffer

object MaximumSubarray {
  def maxSubArray(nums: Array[Int]): Int = {
    val combinations = generateNumbersCombinations(nums).sortWith(_.length < _.length)
    val item = combinations.map(item => (item, item.sum)).sortWith(_._2 > _._2).head
    println(item._1)
    item._2
  }

  private def generateNumbersCombinations(numbers: Array[Int]): ListBuffer[List[Int]] = {
    var result = ListBuffer[List[Int]]()
    for(idx <- 0 to numbers.length) {
      for(idx2 <- idx + 1 to numbers.length) {
        result += numbers.slice(idx, idx2).toList
      }
    }
    result
  }
}
