package com.es.scala.chapter06

import org.specs2.mutable.Specification

class RationalTest extends Specification {
  "com.es.scala.chapter06.Rational" should {
    "compute the sum of rational numbers from 1/1 to 1/10" in {
      var i = 1
      var x = new Rational(0, 1)
      while (i <= 10) {
        x += new Rational(1, i)
        i += 1
      }
      (new Rational(7381, 2520) == x) must beTrue
    }
  }
}
