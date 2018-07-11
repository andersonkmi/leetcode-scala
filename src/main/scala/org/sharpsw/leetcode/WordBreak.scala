package org.sharpsw.leetcode

object WordBreak {
  def wordBreak(s: String, wordDict: List[String]): Boolean = {
    val pos = new Array[Int](s.length + 1)

    for(index <- pos.indices) {
      pos(index) = -1
    }
    pos(0) = 0

    for(idx <- 0 until s.length) {
      if(pos(idx) != -1) {
        for(j <- (idx + 1 ) to s.length) {
          val sub = s.substring(idx, j)
          if(wordDict.contains(sub)) {
            pos(j) = idx
          }
        }
      }
    }

    pos(s.length()) != -1
  }
}
