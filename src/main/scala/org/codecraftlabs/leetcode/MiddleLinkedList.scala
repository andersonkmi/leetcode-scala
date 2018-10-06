package org.codecraftlabs.leetcode

object MiddleLinkedList {
  def middleNode(head: ListNode): Option[ListNode] = {
    val rootNode = Option(head)

    rootNode match {
      case None => None
      case _ => val size = length(head)
                val middle = size / 2
                Option(elementAt(middle, head))
    }
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
