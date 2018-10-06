package org.codecraftlabs.leetcode

object MiddleLinkedList {
  def middleNode(head: ListNode): ListNode = {
    if(head == null) null

    val size = length(head)
    val middle = size / 2
    elementAt(middle, head)
  }

  private def length(root: ListNode): Int = {
    count(root)
  }

  private def count(node: ListNode): Int = {
    if(node != null) {
      1 + count(node.next)
    } else 0
  }

  private def elementAt(position: Int, node: ListNode): ListNode = {
    var counter = 0
    var item = node
    while (counter < position) {
      item = item.next
      counter += 1
    }
    item
  }

}
