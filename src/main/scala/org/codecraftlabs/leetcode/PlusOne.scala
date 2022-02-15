package org.codecraftlabs.leetcode

object PlusOne {
  def plusOne(digits: Array[Int]): Array[Int] = {
    val currentNumber = composeNumber(digits)
    val newNumber = currentNumber + 1
    decomposeNumber(newNumber)
  }

  private def composeNumber(digits: Array[Int]): BigInt = {
    val number = digits.mkString
    BigInt(number)
  }

  private def decomposeNumber(number: BigInt): Array[Int] = {
    val strRep = number.toString
    strRep.toCharArray.map(item => item.asDigit)
  }
}
