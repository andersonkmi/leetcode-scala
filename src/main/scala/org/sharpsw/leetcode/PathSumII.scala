package org.sharpsw.leetcode

import scala.collection.mutable.ListBuffer

object PathSumII {
  def pathSum(root: TreeNode, sum: Int): List[List[Int]] = {
    val currentSum = 0
    val paths = ListBuffer[Int]()
    val results = ListBuffer[List[Int]]()
    preOrderTraversal(root, sum, currentSum, paths, results)
    results.toList
  }

  private def preOrderTraversal(node: TreeNode, sum: Int, currentSum: Int, path: ListBuffer[Int], results: ListBuffer[List[Int]]): Unit = {
    if(node != null) {
      path += node._value
      val currentValue = visitNode(node, sum, currentSum, path, results)
      preOrderTraversal(node.left, sum, currentValue, path, results)
      preOrderTraversal(node.right, sum, currentValue, path, results)
      path.remove(path.size - 1)
    }
  }

  private def visitNode(node: TreeNode, sum: Int, currentSum: Int, path: ListBuffer[Int], results: ListBuffer[List[Int]]): Int = {
    val currentVal = currentSum + node._value
    if(node.left == null && node.right == null) {
      if (currentVal == sum) {
        results += path.toList
      }
    }
    currentVal
  }

}
