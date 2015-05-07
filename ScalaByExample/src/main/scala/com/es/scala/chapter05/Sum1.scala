package com.es.scala.chapter05

/**
 * Shorter way of writing Sum, avoiding spelling out the arguments
 */
class Sum1 {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }
}
