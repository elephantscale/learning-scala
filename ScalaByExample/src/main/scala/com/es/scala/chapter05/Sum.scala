package com.es.scala.chapter05

/**
 * Created by mark on 12/2/14.
 */
class Sum {
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)
}
