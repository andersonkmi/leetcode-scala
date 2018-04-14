package org.sharpsw.leetcode

import scala.collection.mutable

object CountAndSay {
  def countAndSay(n: Int): String = {
    val elements = mutable.LinkedHashMap[Int, String]()
    elements(1) = "1"

    for(i <- 2 to n) {
      elements(i) = say(elements(i - 1))
    }

    elements(n)
  }

  private def say(value: String): String = {
    var elements = mutable.MutableList[(Int, Char)]()
    val stack = mutable.Stack[Char]()

    var counter = 1
    var currentChar = value.charAt(0)

    for(pos <- 1 until value.length) {
     if(value.charAt(pos).equals(currentChar)) {
        counter += 1
      } else {
        val element = (counter, currentChar)
        elements += element

        counter = 1
        currentChar = value.charAt(pos)
      }
    }

    val element = (counter, currentChar)
    elements += element

    elements.map(item => s"${item._1}${item._2}").mkString
  }
}
