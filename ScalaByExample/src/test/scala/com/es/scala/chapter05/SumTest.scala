package com.es.scala.chapter05

import com.es.scala.chapter04.Factorial
import org.specs2.mutable.Specification

/**
 * Anonymous functions
 */
class SumTest extends Specification {
  "com.es.scala.chapter05.Sum" should {
    "sum the numbers" in {
      new Sum().sum(x => x, 3, 5) mustEqual 12
    }
  }

  "com.es.scala.chapter05.Sum" should {
    "sum squares" in {
      new Sum().sum(x => x * x, 3, 4) mustEqual 25
    }
  }

  "com.es.scala.chapter05.Sum1" should {
    "sum the numbers, just be written shorter" in {
      new Sum1().sum(x => x)(3, 5) mustEqual 12
    }
  }
  "com.es.scala.chapter05.Sum2" should {
    "sum the numbers, shorter yet!" in {
      new Sum2().sum(x => x)(3, 5) mustEqual 12
    }
  }
  "com.es.scala.chapter05.Sum3" should {
    "sum the numbers in tail recursive way" in {
      new Sum3().sum(x => x)(3, 5) mustEqual 12
    }
  }
  "com.es.scala.chapter05.Product" should {
    "multiply numbers of an interval" in {
      new Product().product(x => x)(3, 5) mustEqual 60
    }
  }
}
