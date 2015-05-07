package com.es.scala.chapter05

/**
 * Curried sum
 */
class Sum2 {
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)
}
