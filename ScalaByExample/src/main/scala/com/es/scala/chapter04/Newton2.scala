package com.es.scala.chapter04

/**
 * Newton1 with tracing
 */
class Newton2 {

  def sqrtIterate(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIterate(improve(guess, x), x)

  def improve(guess: Double, x: Double) = {
    println("guess=" + guess + " x=" + x)
    val newGuess = (guess + x / guess) / 2
    println("newGuess=" + newGuess)
    newGuess
  }

  def isGoodEnough(guess: Double, x: Double) =
    abs(square(guess) - x) / (square(guess) + x) < 0.01

  def sqrt(x: Double) = sqrtIterate(1.0, x)

  def square(x: Double) = x * x

  def abs(x: Double) = if (x >= 0) x else -x

}
