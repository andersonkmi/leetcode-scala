package org.codecraftlabs.leetcode

object MergeSortedArray {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    val numbers = Array.ofDim[Int](m + n)

    for(index <- 0 until m) {
      numbers(index) = nums1(index)
    }

    for(index <- 0 until n) {
      numbers(index + m) = nums2(index)
    }

    val sortedArray = numbers.sortWith(_ < _)

    for(index <- 0 until m + n) {
      nums1(index) = sortedArray(index)
    }
  }
}
