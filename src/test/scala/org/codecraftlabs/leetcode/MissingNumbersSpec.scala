package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MissingNumbersSpec extends AnyFlatSpec with Matchers {
  "[7, 2, 5, 3, 5, 3] and [7, 2, 5, 4, 6, 3, 5, 3]" should "be [4, 6]" in {
    val array1 = Array(7, 2, 5, 3, 5, 3)
    val array2 = Array(7, 2, 5, 4, 6, 3, 5, 3)

    MissingNumbers.missingNumbers(array1, array2) should contain allOf(4, 6)
  }
}
