package org.codecraftlabs.leetcode

import org.scalatest.{FlatSpec, Matchers}
import WordBreak.wordBreak

class WordBreakSpec extends FlatSpec with Matchers {
  "Test case 001" should "return true" in {
    val wordDict = List("apple", "pen")
    val word = "apple"

    val result = wordBreak(word, wordDict)
    result shouldEqual true
  }

  "Test case 002" should "return false" in {
    val wordDict = List("cats", "dog", "sand", "and", "cat")
    val word = "catsandog"

    val result = wordBreak(word, wordDict)
    result shouldEqual false
  }

  "Test case 003" should "return true" in {
    val wordDict = List("apple", "pen")
    val word = "applepenapple"

    val result = wordBreak(word, wordDict)
    result shouldEqual true
  }

  "Test case 004" should "return true" in {
    val wordDict = List("car", "ca", "rs")
    val word = "cars"

    val result = wordBreak(word, wordDict)
    result shouldEqual true
  }

  "Test case 005" should "return true" in {
    val wordDict = List("aaaa", "aaa")
    val word = "aaaaaaa"

    val result = wordBreak(word, wordDict)
    result shouldEqual true
  }

}
