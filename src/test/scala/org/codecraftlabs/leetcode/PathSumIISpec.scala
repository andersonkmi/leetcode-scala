package org.codecraftlabs.leetcode

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PathSumIISpec extends AnyFlatSpec with Matchers {
  "Test 001" should "be success" in {
    val root = new TreeNode(4)
    val node1 = new TreeNode(3)
    val node2 = new TreeNode(5)
    val node3 = new TreeNode(2)
    val node4 = new TreeNode(1)

    root.left = node1
    root.right = node2

    node1.left = node3
    node1.right = node4

    val result = PathSumII.pathSum(root, 9)
    result.size shouldEqual 2
    result.head should contain allOf(4, 3, 2)
    result.last should contain allOf(4, 5)
  }
}
