package org.codecraftlabs.leetcode

import scala.collection.mutable.ListBuffer
import scala.util.Sorting.quickSort

object LongestCommonPrefix {
  def longestCommonPrefix(strs: Array[String]): String = {
    if(strs.isEmpty) {
      ""
    } else {
      // Sort the original array
      quickSort(strs)
      val maxLength = getLowestLength(strs)
      process(strs, maxLength).mkString
    }
  }

  private def getLowestLength(strings: Array[String]): Int = {
    strings.map(_.length).head
  }

  private def getCharInPosition(strings: Array[String], position: Int): Array[Char] = {
    strings.map(item => item.charAt(position)).distinct
  }

  private def process(strings: Array[String], length: Int): ListBuffer[Char] = {
    val results = ListBuffer[Char]()
    var shouldStop = false

    for {
        index <- 0 until length
        if !shouldStop} {
      val currentList = getCharInPosition(strings, index)
      if(currentList.length == 1) results.append(currentList.head) else shouldStop = true
    }

    results
  }
}
