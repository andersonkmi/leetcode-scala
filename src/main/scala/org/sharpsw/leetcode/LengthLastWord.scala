package org.sharpsw.leetcode

object LengthLastWord {
  def lengthOfLastWord(s: String): Int = {
    val words = s.split("\\s+")
    if (words.length > 0) words.last.length else 0
  }
}
