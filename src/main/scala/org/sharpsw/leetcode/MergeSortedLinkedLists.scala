package org.sharpsw.leetcode

object MergeSortedLinkedLists {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    var root:ListNode = null
    var lastNode:ListNode = null

    var root1 = l1
    var root2 = l2

    while(root1 != null || root2 != null) {
      var node: ListNode = null
      if(root1 != null && root2 != null) {
        if(root1._x < root2._x) {
          node = new ListNode(root1._x)
          root1 = root1.next
        } else {
          node = new ListNode(root2._x)
          root2 = root2.next
        }
      } else if(root1 == null) {
        node = new ListNode(root2._x)
        root2 = root2.next
      } else {
        node = new ListNode(root1._x)
        root1 = root1.next
      }

      if(root == null) {
        root = node
        lastNode = root
      } else {
        lastNode.next = node
        lastNode = node
      }
    }
    root
  }
}
