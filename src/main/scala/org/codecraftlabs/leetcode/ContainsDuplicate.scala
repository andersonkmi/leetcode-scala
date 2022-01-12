package org.codecraftlabs.leetcode

object ContainsDuplicate {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    val numbers = Option(nums)
    numbers match {
      case None => false
      case _ =>  val items = numbers.get
                  if (items.isEmpty) false else items.groupBy(identity).view.mapValues(_.length).exists(item => item._2 > 1)
    }
  }
}
