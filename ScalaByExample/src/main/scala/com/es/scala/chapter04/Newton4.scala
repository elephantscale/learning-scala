package com.es.scala.chapter04

/**
 * Simplified with block-structured scoping rules
 */
class Newton4 {
  def sqrt(x: Double): Double = {
    def sqrtIterate(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIterate(improve(guess, x))
    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2
    def isGoodEnough(guess: Double) =
      abs(square(guess) - x) / (square(guess) + x) < 0.01
    def square(x: Double) = x * x
    def abs(x: Double) = if (x >= 0) x else -x
    return sqrtIterate(1.0)
  }
}
