package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}

class RemoveDuplicatesSortedListSpec extends FlatSpec with Matchers {
  "The RemoveDuplicatesSortedList " should "return null" in {
    RemoveDuplicatesSortedList.deleteDuplicates(null) shouldBe null
  }

  "The RemoveDuplicatesSortedList " should "return 1 with one element" in {
    val item = new ListNode(1)
    val result = RemoveDuplicatesSortedList.deleteDuplicates(item)
    result._x shouldEqual 1
    ListNodeUtils.length(result) shouldEqual 1
  }

  "The RemoveDuplicatesSortedList " should "return 1 with two equal elements" in {
    val item = new ListNode(1)
    val item2 = new ListNode(1)
    item.next = item2

    val result = RemoveDuplicatesSortedList.deleteDuplicates(item)
    result._x shouldEqual 1
    ListNodeUtils.length(result) shouldEqual 1
  }

  "The RemoveDuplicatesSortedList with two distinct elements" should "return 2" in {
    val item = new ListNode(1)
    val item2 = new ListNode(2)
    item.next = item2

    val result = RemoveDuplicatesSortedList.deleteDuplicates(item)
    ListNodeUtils.mkString(result) shouldEqual "1-2"
    ListNodeUtils.length(result) shouldEqual 2
  }

}
