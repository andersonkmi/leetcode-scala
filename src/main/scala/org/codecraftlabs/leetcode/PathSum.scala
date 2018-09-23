package org.codecraftlabs.leetcode

import scala.collection.mutable.ListBuffer

object PathSum {
  def hasPathSum(root: TreeNode, sum: Int): Boolean = {
    val foundSums = ListBuffer[Int]()
    val currentSum = 0
    preOrderTraversal(root, sum, currentSum, foundSums)
    foundSums.contains(sum)
  }

  private def preOrderTraversal(node: TreeNode, sum: Int, currentSum: Int, elements: ListBuffer[Int]): Unit = {
    if(node != null) {
      val currentValue = visitNode(node, currentSum, elements)
      preOrderTraversal(node.left, sum, currentValue, elements)
      preOrderTraversal(node.right, sum, currentValue, elements)
    }
  }

  private def visitNode(node: TreeNode, currentSum: Int, elements: ListBuffer[Int]): Int = {
    println(s"Node value: ${node._value}")
    val currentVal = currentSum + node._value
    if(node.left == null && node.right == null) {
      println(s"Current sum: $currentVal")
      println("Leaf node reached")
      elements += currentVal
    }
    currentVal
  }
}
