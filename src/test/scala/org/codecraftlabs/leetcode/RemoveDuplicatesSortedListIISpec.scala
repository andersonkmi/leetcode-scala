package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RemoveDuplicatesSortedListIISpec extends AnyFlatSpec with Matchers {
  "Empty list" should "return null" in {
    RemoveDuplicatesSortedListII.deleteDuplicates(null) should be (null)
  }

  "List [1, 1]" should "return null" in {
    val item1 = new ListNode(1)
    val item2 = new ListNode(1)

    item1.next = item2

    val result = RemoveDuplicatesSortedListII.deleteDuplicates(item1)
    ListNodeUtils.length(result) shouldEqual 0
  }

  "List [1, 2, 3, 3, 4, 4, 5]" should "return [1, 2, 5]" in {
    val item1 = new ListNode(1)
    val item2 = new ListNode(2)
    val item3 = new ListNode(3)
    val item4 = new ListNode(3)
    val item5 = new ListNode(4)
    val item6 = new ListNode(4)
    val item7 = new ListNode(5)

    item1.next = item2
    item2.next = item3
    item3.next = item4
    item4.next = item5
    item5.next = item6
    item6.next = item7

    val result = RemoveDuplicatesSortedListII.deleteDuplicates(item1)
    ListNodeUtils.length(result) shouldEqual 3
    ListNodeUtils.mkString(result) shouldEqual "1-2-5"
  }

  "List [1, 2, 3, 3, 3, 4, 4, 5]" should "return [1, 2, 5]" in {
    val item1 = new ListNode(1)
    val item2 = new ListNode(2)
    val item3 = new ListNode(3)
    val item4 = new ListNode(3)
    val item5 = new ListNode(3)
    val item6 = new ListNode(4)
    val item7 = new ListNode(4)
    val item8 = new ListNode(5)

    item1.next = item2
    item2.next = item3
    item3.next = item4
    item4.next = item5
    item5.next = item6
    item6.next = item7
    item7.next = item8

    val result = RemoveDuplicatesSortedListII.deleteDuplicates(item1)
    ListNodeUtils.length(result) shouldEqual 3
    ListNodeUtils.mkString(result) shouldEqual "1-2-5"
  }
}
