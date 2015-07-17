package com.es.scala.more

import org.specs2.mutable.Specification

/**
 * Created by mark on 12/4/14.
 */
class UseOfNullTest extends Specification {
  val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

  "com.es.scala.more.UseOfNull" should {
    "distinguish between being passed a null or a non-null" in {
      new UseOfNull().exampleOfNull(days) mustEqual ("Sunday")
      new UseOfNull().exampleOfNull(days) mustNotEqual ("Monday")
      (new UseOfNull().exampleOfNull(null) == null) must beTrue
    }
  }

  "com.es.scala.more.UseOfNil" should {
    "distinguish between being passed a Nil (empty list) or a non-Nil" in {
      new UseOfNull().exampleOfNil(days) mustEqual List("Sunday")
      new UseOfNull().exampleOfNil(Nil) mustEqual Nil
    }
  }

  // TODO this fails
//  "com.es.scala.more.UseOfNil" should {
//    "throw 'non implemented' exception" in {
//      new UseOfNull().notImplemented(1) must throwA[Exception]
//    }
//  }

}
