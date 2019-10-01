package org.codecraftlabs.leetcode

object TwoCharacters {
  def alternate(s: String): Int = {
    val chars = s.toCharArray.distinct
    val combinations = chars.combinations(2).map { case Array(x, y) => (x, y) }.toList
    val elements = combinations.map(i => s.replaceAll(s"[^${i._1}${i._2}]", ""))
    val filtered = elements.filter(validate)
    filtered.map(item => item.length).sorted.reverse.head
  }

  private def validate(item: String): Boolean = {
    val lastPosition = item.length - 2
    for (pos <- 0 until lastPosition) {
      if (item.charAt(pos) != item.charAt(pos + 2)) {
        return false
      }
    }
    true
  }
}
