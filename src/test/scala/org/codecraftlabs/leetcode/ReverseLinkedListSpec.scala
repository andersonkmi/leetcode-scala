package org.codecraftlabs.leetcode

import org.codecraftlabs.leetcode.ListNodeUtils.mkString
import org.codecraftlabs.leetcode.ReverseLinkedList.reverseList
import org.scalatest.{FlatSpec, Matchers}

class ReverseLinkedListSpec extends FlatSpec with Matchers {
  it should "return 3 -> 2 -> 1" in {
    val node1 = new ListNode(1)
    val node2 = new ListNode(2)
    val node3 = new ListNode(3)

    node1.next = node2
    node2.next = node3

    val result = mkString(reverseList(node1))
    result shouldEqual "3-2-1"
  }

  it should "return 1" in {
    val node1 = new ListNode(1)
    val result = mkString(reverseList(node1))
    result shouldEqual "1"
  }
}

