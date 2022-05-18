package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PickingNumbersSpec extends AnyFlatSpec with Matchers {
  "[1, 1, 2, 2, 4, 4, 5, 5, 5]" should "return 5" in {
    val numbers = Array(1, 1, 2, 2, 4, 4, 5, 5, 5)
    PickingNumbers.pickingNumbers(numbers) shouldEqual 5
  }

  "[5, 5, 5]" should "return 3" in {
    val numbers = Array(5, 5, 5)
    PickingNumbers.pickingNumbers(numbers) shouldEqual 3
  }
}
