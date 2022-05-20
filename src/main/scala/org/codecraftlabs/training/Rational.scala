package org.codecraftlabs.training

import scala.annotation.tailrec

class Rational (n: Int, d: Int) {
  require(d != 0)

  private val g = gcd (n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this (n: Int) = this(n, 1)

  override def toString: String = numer + "/" + denom

  def add(that: Rational): Rational = {
    new Rational (numer * that.denom + that.numer * denom, denom * that.denom)
  }

  def lessThan(that: Rational): Boolean = {
    this.numer * that.denom < that.numer * this.denom
  }

  @tailrec
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd (b, a % b)
  }
}
