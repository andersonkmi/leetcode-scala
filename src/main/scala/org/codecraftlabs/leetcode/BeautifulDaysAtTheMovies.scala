package org.codecraftlabs.leetcode

object BeautifulDaysAtTheMovies {
  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    // Create a list of dates
    Array.range(i, j + 1).map(i => {
      math.abs(i.toString.reverse.toLong - i) % k
    }).count(i => i == 0)

  }
}
