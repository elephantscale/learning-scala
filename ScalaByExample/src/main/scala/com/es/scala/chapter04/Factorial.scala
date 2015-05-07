package com.es.scala.chapter04

/**
 * Tail-recursive version of factorial
 */
class Factorial {
  // non-tail-recursive
  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

  // tail-recursive factorial
  def factorialR(n: Int): Int = {
    def factorial1(n: Int, accumulator: Int): Int =
      if (n == 0) accumulator else factorial1(n - 1, n * accumulator)
    factorial1(n, 1)
  }
}
