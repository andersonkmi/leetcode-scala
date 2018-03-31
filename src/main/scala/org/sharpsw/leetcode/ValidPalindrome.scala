package org.sharpsw.leetcode

object ValidPalindrome {
  def isPalindrome(s: String): Boolean = {
    if(s == null || s.isEmpty) true
    else {
      val modifiedString = keepCharsOnly(changeToLowercase(s))
      val reversedString = modifiedString.reverse
      modifiedString.equals(reversedString)
    }
  }

  private def changeToLowercase(sentence: String): String = {
    sentence.toLowerCase
  }

  private def keepCharsOnly(sentence: String): String = {
    val ordinary=(('a' to 'z') ++ ('0' to '9')).toSet
    sentence.map(item => {
      if(ordinary.contains(item)) item else ""
    }).mkString
  }
}
