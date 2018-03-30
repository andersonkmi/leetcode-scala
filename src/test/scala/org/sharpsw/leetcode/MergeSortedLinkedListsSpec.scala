package org.sharpsw.leetcode

import org.scalatest.{FlatSpec, Matchers}

class MergeSortedLinkedListsSpec extends FlatSpec with Matchers {
  "Given null lists to be merged" should "return null" in {
    val result = MergeSortedLinkedLists.mergeTwoLists(null, null)
    result should be (null)
  }

  "Given 2 singled item lists to be merged" should "return [1, 1]" in {
    val list1 = new ListNode(1)
    val list2 = new ListNode(1)

    val result = MergeSortedLinkedLists.mergeTwoLists(list1, list2)
    ListNodeUtils.length(result) shouldEqual 2
    ListNodeUtils.mkString(result) shouldEqual "1-1"
  }

  "Given 2 singled item lists with values 1 and 2" should "return [1, 2]" in {
    val list1 = new ListNode(2)
    val list2 = new ListNode(1)

    val result = MergeSortedLinkedLists.mergeTwoLists(list1, list2)
    ListNodeUtils.length(result) shouldEqual 2
    ListNodeUtils.mkString(result) shouldEqual "1-2"
  }

  "Given 2 singled item lists with values [1, 2] and [3]" should "return [1, 2, 3]" in {
    val list1 = new ListNode(2)
    val list2 = new ListNode(1)
    val list22 = new ListNode(3)
    list2.next = list22

    val result = MergeSortedLinkedLists.mergeTwoLists(list1, list2)
    ListNodeUtils.length(result) shouldEqual 3
    ListNodeUtils.mkString(result) shouldEqual "1-2-3"
  }
}
