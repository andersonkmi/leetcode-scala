package org.codecraftlabs.leetcode

import org.codecraftlabs.leetcode.MiddleLinkedList.middleNode
import org.scalatest.{FlatSpec, Matchers}

class MiddleLinkedListSpec extends FlatSpec with Matchers {
  "Null list" should "return null" in {
    middleNode(null) shouldBe null
  }

  "Single node list" should "return first node" in {
    val item = new ListNode(1)
    val result = middleNode(item)
    result should not be null
    result.x shouldEqual 1
  }

  "Even sized list" should "return first element of second half of the list" in {
    val firstNode = new ListNode(0)
    val secondNode = new ListNode(1)
    firstNode.next = secondNode

    val result = middleNode(firstNode)
    result should not be null
    result.x should equal(1)
  }

  "Odd size list" should "return exactly the middle element" in {
    val firstNode = new ListNode(0)
    val secondNode = new ListNode(1)
    val thirdNode = new ListNode(2)

    firstNode.next = secondNode
    secondNode.next = thirdNode

    val result = middleNode(firstNode)
    result should not be null
    result.x should equal(1)
  }
}
