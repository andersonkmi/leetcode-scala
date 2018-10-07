package org.codecraftlabs.leetcode

object JewelsAndStones {
  def numJewelsInStones(j: String, s: String): Int = {
    val jewels = j.toSet
    val stones = s.toList

    val groupedStones = stones.groupBy(identity).mapValues(_.length)
    groupedStones.filterKeys(jewels).values.sum
  }
}
