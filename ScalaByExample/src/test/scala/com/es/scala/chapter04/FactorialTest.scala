package com.es.scala.chapter04

import org.specs2.mutable.Specification

/**
 * Created by mark on 12/2/14.
 */
class FactorialTest extends Specification {

  "com.es.scala.chapter04.Factorial.factorial" should {
    "calculate factorial" in {
      new Factorial().factorial(5) mustEqual (120)
    }
  }

  "com.es.scala.chapter04.Factorial.factorialR" should {
    "calculate factorial but not require stack" in {
      println("new Factorial().factorialR(5)=" + new Factorial().factorialR(5))
      new Factorial().factorialR(5) mustEqual (120)
    }
  }
}
