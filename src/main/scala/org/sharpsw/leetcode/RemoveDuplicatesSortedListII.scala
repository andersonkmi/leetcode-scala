package org.sharpsw.leetcode

object RemoveDuplicatesSortedListII {
  def deleteDuplicates(head: ListNode): ListNode = {
    if(head == null) return null

    var node = head
    val numbers = scala.collection.mutable.Map[Int, Int]()
    while(node != null) {
      if (!numbers.contains(node._x)) {
        numbers.put(node._x, 1)
      } else {
        val currentCount = numbers(node._x)
        numbers(node._x) =  currentCount + 1
      }
      node = node.next
    }

    val filteredNumbers = numbers.filter(item => item._2 == 1).keys.toList.sorted
    val result: ListNode = new ListNode(filteredNumbers.head)
    var lastNode = result
    filteredNumbers.foreach(item => {
      if(item != lastNode._x) {
        val node = new ListNode(item)
        lastNode.next = node
        lastNode = node
      }
    })
    result
  }
}
