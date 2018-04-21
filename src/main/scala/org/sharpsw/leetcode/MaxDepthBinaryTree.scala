package org.sharpsw.leetcode

import scala.collection.mutable

object MaxDepthBinaryTree {
  def maxDepth(root: TreeNode): Int = {
    val treeLevels = mutable.SortedSet[Int]()
    treeLevels += 0
    traverse(root, 1, treeLevels)
    treeLevels.last
  }

  private def traverse(node: TreeNode, currentLevel: Int, treeLevels: mutable.SortedSet[Int]): Unit = {
    if(node != null) {
      treeLevels += currentLevel
      traverse(node.left, currentLevel + 1, treeLevels)
      traverse(node.right, currentLevel + 1, treeLevels)
    }
  }
}
