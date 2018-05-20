package org.sharpsw.leetcode

object PlusOne {
  def plusOne(digits: Array[Int]): Array[Int] = {
    val currentNumber = composeNumber(digits, 0)
    val newNumber = currentNumber + 1
    decomposeNumber(newNumber)
  }

  private def composeNumber(digits: Array[Int], position: Int): BigInt = {
    val number = digits.mkString
    BigInt(number)
  }

  private def decomposeNumber(number: BigInt): Array[Int] = {
    val strRep = number.toString
    strRep.map(item => item.asDigit).toArray[Int]
  }
}
