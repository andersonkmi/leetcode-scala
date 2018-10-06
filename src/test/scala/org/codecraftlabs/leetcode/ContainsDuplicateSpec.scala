package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}
import org.codecraftlabs.leetcode.ContainsDuplicate.containsDuplicate

class ContainsDuplicateSpec extends FlatSpec with Matchers {
  "Null array" should "return false" in {
    containsDuplicate(null) shouldEqual false
  }

  "Empty array" should "return false" in {
    val items = Array[Int]()
    containsDuplicate(items) shouldEqual false
  }

  "[1]" should "return false" in {
    val elements = Array[Int](1)
    containsDuplicate(elements) shouldEqual false
  }

  "[1, 1]" should "return true" in {
    val elements = Array[Int](1, 1)
    containsDuplicate(elements) shouldEqual true
  }

  "[1, 2, 3, 1]" should "return true" in {
    val elements = Array[Int](1, 2, 3, 1)
    containsDuplicate(elements) shouldEqual true
  }

  "[1, 2, 3, 4]" should "return false" in {
    val elements = Array[Int](1, 2, 3, 4)
    containsDuplicate(elements) shouldEqual false
  }
}
