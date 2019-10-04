package org.codecraftlabs.leetcode

object MissingNumbers {
  def missingNumbers(arr: Array[Int], brr: Array[Int]): Array[Int] = {
    brr.diff(arr).distinct.sorted
  }

}
