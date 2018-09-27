package org.codecraftlabs.leetcode

object AddBinary {
  def addBinary(a: String, b: String): String = {
    val aDecimal: BigInt = BigInt(a, 2)
    val bDecimal: BigInt = BigInt(b, 2)

    val resultDecimal: BigInt = aDecimal + bDecimal
    val resultBinary = decimal2Binary(resultDecimal)
    resultBinary
  }

  private def decimal2Binary(value: BigInt): String = {
    if (value == 0) "0"
    else {
      val elements: List[Int] = List()
      dec2Bin(value, elements)
    }
  }

  private def dec2Bin(value: BigInt, elements: List[Int]): String = {
    value match {
      case value if value == 0 => elements.mkString
      case x =>
        val currentValue = value / 2
        val remainder = (value % 2).toInt
        dec2Bin(currentValue, remainder :: elements)
    }
  }

  private def binary2Decimal(value: String): BigInt = {
    val elements = value.map(item => item.toString.toInt).toList.reverse
    bin2Dec(elements, 0, 0)
  }

  private def bin2Dec(numbers: List[Int], accum: BigInt, exponent: Int): BigInt = {
    numbers match {
      case Nil => accum
      case x :: tail =>
        val currentValue: BigInt = BigInt(x * scala.math.pow(2, exponent).toLong)
        val currentSum: BigInt = accum + currentValue
        bin2Dec(tail, currentSum, exponent + 1)
    }
  }
}
