package org.codecraftlabs.utils

object NumberConverter {
  def decimal2Binary(value: Long): String = {
    if (value == 0) "0"
    else {
      val elements: List[Long] = List()
      dec2Bin(value, elements)
    }
  }

  private def dec2Bin(value: Long, elements: List[Long]): String = {
    value match {
      case 0 => elements.mkString
      case x =>
        val currentValue = value / 2
        val remainder = value % 2
        dec2Bin(currentValue, remainder :: elements)
    }
  }

  def binary2Decimal(value: String): Long = {
    val elements = value.map(item => item.toString.toInt).reverse.toList
    bin2Dec(elements, 0, 0)
  }

  private def bin2Dec(numbers: List[Int], accum: Long, exponent: Int): Long = {
    numbers match {
      case Nil => accum
      case x :: tail =>
        val currentValue = x * scala.math.pow(2, exponent).toLong
        val currentSum = accum + currentValue
        bin2Dec(tail, currentSum, exponent + 1)
    }
  }
}
