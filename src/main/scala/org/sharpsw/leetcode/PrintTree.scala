package org.sharpsw.leetcode

import scala.collection.mutable.ListBuffer

object PrintTree {
  def printNodesByLevel(root: TreeNode): Unit = {
    val elements = ListBuffer[Int]()
    visitNode(root, elements)
    println(elements.mkString(" "))
  }

  private def visitNode(node: TreeNode, items: ListBuffer[Int]): Unit = {
    val elements = ListBuffer[TreeNode]()
    elements += node

    while(elements.nonEmpty) {
      val currentNode = elements.remove(0)
      items += currentNode._value

      if(currentNode.left != null) {
        elements += currentNode.left
      }

      if(currentNode.right != null) {
        elements += currentNode.right
      }
    }
  }
}
