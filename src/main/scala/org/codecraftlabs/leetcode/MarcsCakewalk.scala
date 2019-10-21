package org.codecraftlabs.leetcode

object MarcsCakewalk {
  def marcsCakewalk(calorie: Array[Int]): Long = {
    val reversedCalories = calorie.sorted.reverse
    reversedCalories.zipWithIndex.map{ case (e, i) => Math.pow(2, i).toLong * e}.sum
  }

}
