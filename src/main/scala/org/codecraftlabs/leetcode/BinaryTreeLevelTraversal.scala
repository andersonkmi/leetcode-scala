package org.codecraftlabs.leetcode

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object BinaryTreeLevelTraversal {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    val resultingMap = mutable.LinkedHashMap[Int, ListBuffer[Int]]()
    preOrderTraversal(root, 0, resultingMap)
    val finalResult = resultingMap.map(item => item._2.toList)
    finalResult.toList
  }

  private def preOrderTraversal(node: TreeNode, currentLevel: Int, elements: scala.collection.mutable.LinkedHashMap[Int, ListBuffer[Int]]): Unit = {
    if(node != null) {
      visitNode(node, currentLevel, elements)
      preOrderTraversal(node.left, currentLevel + 1, elements)
      preOrderTraversal(node.right, currentLevel + 1, elements)
    }
  }

  private def visitNode(node: TreeNode, currentLevel: Int, elements: scala.collection.mutable.LinkedHashMap[Int, ListBuffer[Int]]): Unit = {
    println(s"Node value: ${node._value}")
    if(elements.exists(_._1 == currentLevel)) {
      val levelList = elements(currentLevel)
      levelList += node._value
    } else {
      elements(currentLevel) = ListBuffer(node._value)
    }
  }

}
