package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}
import org.codecraftlabs.leetcode.BeautifulDaysAtTheMovies.beautifulDays

class BeautifulDaysAtTheMoviesSpec extends FlatSpec with Matchers {
  "This" should "OK" in {
    beautifulDays(1, 2000000, 23047885) shouldEqual 2998
  }
}
