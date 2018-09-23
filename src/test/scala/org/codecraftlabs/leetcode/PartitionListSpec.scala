package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}
import PartitionList._

class PartitionListSpec extends FlatSpec with Matchers {
  "1->4->3->2->5->2 and x = 2" should "return 1-2-2-4-3-5" in {
    val node1 = new ListNode(1)
    val node2 = new ListNode(4)
    val node3 = new ListNode(3)
    val node4 = new ListNode(2)
    val node5 = new ListNode(5)
    val node6 = new ListNode(2)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    val result = partition(node1, 3)
    ListNodeUtils.mkString(result) shouldEqual "1-2-2-4-3-5"
  }

  "1->4->3->2->5->2->3" should "return 1-2-2-4-3-5-3" in {
    val node1 = new ListNode(1)
    val node2 = new ListNode(4)
    val node3 = new ListNode(3)
    val node4 = new ListNode(2)
    val node5 = new ListNode(5)
    val node6 = new ListNode(2)
    val node7 = new ListNode(3)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = node7

    val result = partition(node1, 3)
    ListNodeUtils.mkString(result) shouldEqual "1-2-2-4-3-5-3"
  }

  "1->4->2-10" should "return 1-2-4-10" in {
    val node1 = new ListNode(1)
    val node2 = new ListNode(4)
    val node3 = new ListNode(2)
    val node4 = new ListNode(10)
    node1.next = node2
    node2.next = node3
    node3.next = node4

    val result = partition(node1, 3)
    ListNodeUtils.mkString(result) shouldEqual "1-2-4-10"
  }
}
