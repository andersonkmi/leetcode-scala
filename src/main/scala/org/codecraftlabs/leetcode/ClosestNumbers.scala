package org.codecraftlabs.leetcode

object ClosestNumbers {
  def closestNumbers(arr: Array[Int]): Array[Int] = {
    val sortedArray = arr.sorted.toList
    val smallestDiff = sortedArray.sliding(2).map { case Seq(x, y, _*) => (y - x) }.toList.min
    sortedArray.sliding(2).toList.filter(pair => pair.last - pair.head == smallestDiff).flatten.toArray
  }
}