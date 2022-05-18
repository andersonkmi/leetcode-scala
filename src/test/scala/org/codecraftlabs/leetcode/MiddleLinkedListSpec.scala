package org.codecraftlabs.leetcode

import org.codecraftlabs.leetcode.MiddleLinkedList.middleNode
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MiddleLinkedListSpec extends AnyFlatSpec with Matchers {
  "Null list" should "return None" in {
    middleNode(null) shouldBe None
  }

  "Single node list" should "return first node" in {
    val item = new ListNode(1)
    val result = middleNode(item)
    result should not be None
    result.get.x shouldEqual 1
  }

  "Even sized list" should "return first element of second half of the list" in {
    val firstNode = new ListNode(0)
    val secondNode = new ListNode(1)
    firstNode.next = secondNode

    val result = middleNode(firstNode)
    result should not be None
    result.get.x should equal(1)
  }

  "Odd size list" should "return exactly the middle element" in {
    val firstNode = new ListNode(0)
    val secondNode = new ListNode(1)
    val thirdNode = new ListNode(2)

    firstNode.next = secondNode
    secondNode.next = thirdNode

    val result = middleNode(firstNode)
    result should not be None
    result.get.x should equal(1)
  }
}
