package org.codecraftlabs.leetcode

import org.codecraftlabs.leetcode.AddBinary.addBinary
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AddBinarySpec extends AnyFlatSpec with Matchers {
  "a = \"11\", b = \"1\"" should "return 100" in {
    addBinary("11", "1") shouldEqual "100"
  }

  "Test 2" should "return ok" in {
    addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
      "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011") shouldEqual "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"
  }
}
