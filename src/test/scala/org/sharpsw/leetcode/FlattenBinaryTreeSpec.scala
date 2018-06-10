package org.sharpsw.leetcode

import org.scalatest.{FlatSpec, Matchers}

class FlattenBinaryTreeSpec extends FlatSpec with Matchers {
  "Binary tree" should "be flattened ok" in {
    val root = new TreeNode(4)
    val node1 = new TreeNode(3)
    val node2 = new TreeNode(5)
    val node3 = new TreeNode(2)
    val node4 = new TreeNode(1)

    root.left = node1
    root.right = node2

    node1.left = node3
    node1.right = node4

    val result = FlattenBinaryTree.flatten(root)
    var node = result
    while(node != null) {
      println(node.value)
      node = node.right
    }
  }
}
