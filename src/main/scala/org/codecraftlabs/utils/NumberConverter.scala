package org.codecraftlabs.utils

object NumberConverter {
  def decimal2Binary(value: Int): String = {
    if (value == 0) "0"
    else {
      val elements: List[Int] = List()
      dec2Bin(value, elements)
    }
  }

  private def dec2Bin(value: Int, elements: List[Int]): String = {
    value match {
      case 0 => elements.mkString
      case x => {
        val currentValue = value / 2
        val remainder = value % 2
        dec2Bin(currentValue, remainder :: elements)
      }
    }
  }
}
