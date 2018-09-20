package org.sharpsw.leetcode

import org.scalatest.{FlatSpec, Matchers}
import org.sharpsw.leetcode.PartitionList._

class PartitionListSpec extends FlatSpec with Matchers {
  "Test 001" should "OK" in {
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
}
