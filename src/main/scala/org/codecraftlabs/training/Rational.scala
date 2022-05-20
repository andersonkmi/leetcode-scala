package org.codecraftlabs.training

class Rational (n: Int, d: Int) {
  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  def this (n: Int) = this(n, 1)

  override def toString: String = numer + "/" + denom

  def add(that: Rational): Rational = {
    new Rational (numer * that.denom + that.numer * denom, denom * that.denom)
  }

  def lessThan(that: Rational): Boolean = {
    this.numer * that.denom < that.numer * this.denom
  }
}
