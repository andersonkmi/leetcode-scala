package org.codecraftlabs.leetcode

object RomanToInt {
  def romanToInt(s: String): Int = {
    val numberMap = Map("I" -> 1, "V" -> 5, "X" -> 10, "L" -> 50, "C" -> 100, "D" -> 500, "M" -> 1000)

    val mappedVals = s.toCharArray.map(item => numberMap(item.toString)).reverse
    var currentVal = 0
    var total = 0
    mappedVals.foreach(item => {
      if(item >= currentVal) {
        total = total + item
      } else {
        total = total - item
      }
      currentVal = item
    })

    total
  }
}
