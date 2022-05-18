package org.codecraftlabs.leetcode

import org.codecraftlabs.leetcode.BeautifulDaysAtTheMovies.beautifulDays
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BeautifulDaysAtTheMoviesSpec extends AnyFlatSpec with Matchers {
  "This" should "OK" in {
    beautifulDays(1, 2000000, 23047885) shouldEqual 2998
  }
}
