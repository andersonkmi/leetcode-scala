package org.sharpsw.leetcode

object Main extends App {
  val node1 = new TreeNode(5)
  val node2 = new TreeNode(4)
  val node3 = new TreeNode(8)
  val node4 = new TreeNode(11)
  val node5 = new TreeNode(13)
  val node6 = new TreeNode(4)
  val node7 = new TreeNode(7)
  val node8 = new TreeNode(2)
  val node9 = new TreeNode(1)

  node1.left = node2
  node1.right = node3

  node2.left = node4

  node3.left = node5
  node3.right = node6

  node4.left = node7
  node4.right = node8

  node6.right = node9

  println(PathSum.hasPathSum(node1, 21))
}
