package org.sharpsw.leetcode

import scala.collection.mutable

object CountAndSay {
  def countAndSay(n: Int): String = {

  }

  private def say(value: String): String = {
    val digitsMap:mutable.LinkedHashMap[Char, Int] = mutable.LinkedHashMap[Char, Int]()

    value.foreach(character => {
      if(digitsMap.contains(character)) {
        val counter = digitsMap.get(character).get
        digitsMap.put(character, counter + 1)
      } else {
        digitsMap.put(character, 1)
      }
    })

    digitsMap.map(item => item._1 + item._2).mkString
  }
}
