package org.sharpsw.leetcode

import scala.collection.mutable.ListBuffer

object FlattenBinaryTree {
  def flatten(root: TreeNode): TreeNode = {
    val path = ListBuffer[TreeNode]()
    preOrderTraversal(root, path)
    //path.foreach(item => println(item.value))

    var index = 0
    while(index < path.size - 1) {
      val item = path(index)
      item.right = path(index + 1)
      index += 1
    }
    path.head
  }

  private def preOrderTraversal(node: TreeNode, path: ListBuffer[TreeNode]): Unit = {
    if(node != null) {
      path += new TreeNode(node._value)
      preOrderTraversal(node.left, path)
      preOrderTraversal(node.right, path)
    }
  }
}
