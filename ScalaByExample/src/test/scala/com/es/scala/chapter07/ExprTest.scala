package com.es.scala.chapter07

import org.specs2.mutable.Specification

class ExprTest extends Specification {
  "com.es.scala.chapter07.Expr" should {
    "have an easy way to evaluate expressions" in {
      new Number(1).eval(Sum(Sum(Number(1), Number(2)), Number(3))) mustEqual new Number(1).eval(Number(6))
    }
  }
}
