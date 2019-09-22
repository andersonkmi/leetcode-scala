package org.codecraftlabs.leetcode

object PickingNumbers {
  def pickingNumbers(numbers: Array[Int]): Int = {
    val distinctValues = numbers.distinct
    var maxSize = 0
    distinctValues.foreach(i => {
      val currentSize = numbers.count(x => (x == i) || (x == i + 1))
      if (currentSize > maxSize) maxSize = currentSize
    })
    maxSize
  }
}
