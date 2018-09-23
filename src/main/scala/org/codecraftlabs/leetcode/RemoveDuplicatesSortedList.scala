package org.codecraftlabs.leetcode

object RemoveDuplicatesSortedList {
  def deleteDuplicates(head: ListNode): ListNode = {
    if(head == null) {
      head
    } else {
      val root = new ListNode(head._x)
      var lastNode = root
      var currentValue = head._x

      var node = head
      while(node != null) {
        if(node._x != currentValue ) {
          val element = new ListNode(node._x)
          lastNode.next = element
          lastNode = element
          currentValue = element._x
        }
        node = node.next
      }
      root
    }
  }
}
