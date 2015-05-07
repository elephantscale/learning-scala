package com.es.scala.chapter05

/**
 * Function product that computes the product of the values of
 * functions at points over a given range.
 */
class Product {
  def product(f: Int => Int): (Int, Int) => Int = {
    def productF(a: Int, b: Int): Int =
      if (a > b) 1 else f(a) * productF(a + 1, b)
    productF
  }
}
