package com.es.scala.chapter04

class Newton {
  def sqrtIterate(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIterate(improve(guess, x), x)

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) =
    abs(square(guess) - x) < 0.001

  def sqrt(x: Double) = sqrtIterate(1.0, x)

  def square(x: Double) = x * x

  def abs(x: Double) = if (x >= 0) x else -x

}
