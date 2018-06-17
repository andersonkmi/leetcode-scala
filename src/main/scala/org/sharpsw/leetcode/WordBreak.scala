package org.sharpsw.leetcode

object WordBreak {
  def wordBreak(s: String, wordDict: List[String]): Boolean = {
    var word = s
    var stop = false
    val sortedDict = wordDict.sorted

    while(word.nonEmpty && !stop) {
      val result = wordDict.map(item => (item, word.startsWith(item)))
      result.foreach(i => println(i._1 + i._2))
      val element = result.find(item => item._2)
      element match {
        case Some(i) => word = word.substring(i._1.length)
        case None => stop = true
      }

      println("word: " + word)
    }

    if (!stop && word.isEmpty) true else false
  }
}
