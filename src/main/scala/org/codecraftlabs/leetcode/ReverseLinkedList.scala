package org.codecraftlabs.leetcode

import scala.collection.mutable

object ReverseLinkedList {
  def reverseList(head: ListNode): ListNode = {
    val nodeStack = mutable.ArrayStack[ListNode]()
    process(head, nodeStack)
    nodeStack.head
  }

  private def process(node: ListNode, nodeStack: mutable.ArrayStack[ListNode]): Unit = {
    if (node != null) {
      val item = node.next

      val headItem = nodeStack.headOption
      headItem match {
        case None => node.next = null
        case _ => node.next = headItem.get
      }

      nodeStack.push(node)
      process(item, nodeStack)
    }
  }
}
