package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}

class SubDomainVisitCountSpec extends FlatSpec with Matchers {
  "Test case 001" should "return true" in {
    val items = Array("500 test.com")
    val result = SubDomainVisitCount.subDomainVisits(items)
  }
}
