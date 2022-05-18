package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SubDomainVisitCountSpec extends AnyFlatSpec with Matchers {
  "Test case 001" should "return true" in {
    val items = Array("500 test.com")
    val result = SubDomainVisitCount.subDomainVisits(items)
  }
}
