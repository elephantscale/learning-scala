package com.es.scala.chapter05

/**
 * Tail recursive sum
 */
class Sum3 {
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def iter(a: Int, result: Int): Int = {
      if (a > b) 0
      else f(a) + iter(f(a + 1), b)
    }
    iter(a, b)
  }
}
