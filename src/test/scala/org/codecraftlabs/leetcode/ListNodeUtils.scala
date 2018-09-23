package org.codecraftlabs.leetcode

object ListNodeUtils {
  def length(root: ListNode): Int = {
    count(root)
  }

  def mkString(root: ListNode): String = {
    print(root).stripSuffix("-")
  }

  private def count(node: ListNode): Int = {
    if(node != null) {
      1 + count(node.next)
    } else 0
  }

  private def print(node: ListNode): String = {
    if(node != null) {
      node._x.toString + "-" + print(node.next)
    } else ""
  }
}
