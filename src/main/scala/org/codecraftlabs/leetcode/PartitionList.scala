package org.codecraftlabs.leetcode

import scala.collection.mutable.ListBuffer

object PartitionList {
  def partition(head: ListNode, x: Int): ListNode = {
    val smaller = ListBuffer.empty[Int]
    val higher = ListBuffer.empty[Int]

    var item = head
    while(item != null) {
      if(item._x < x) {
        smaller += item._x
      } else {
        higher += item._x
      }

      item = item.next
    }

    val finalResult = smaller ++ higher

    if(finalResult.nonEmpty) {
      val convertedNodes = finalResult.map(item => new ListNode(item))
      val headNode = convertedNodes.head
      var currentNode = headNode

      var index = 1
      while(index < convertedNodes.size) {
        val node = convertedNodes(index)
        currentNode.next = node
        index += 1
        currentNode = node
      }

      headNode
    } else null
  }
}
