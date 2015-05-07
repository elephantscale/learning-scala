package com.es.scala.chapter04

import org.specs2.mutable.Specification
import Math.abs

/**
 * Created by mark on 12/1/14.
 */
class NewtonTest extends Specification {
  "com.es.scala.chapter04.Newton" should {
    "extract square root" in {
      abs(new Newton().sqrt(4) - 2) must be <= .1
    }
  }

  "com.es.scala.chapter04.Newton1" should {
    "extract square root better for small numbers" in {
      abs(new Newton1().sqrt(.01) - .1) must be <= .1
    }
  }

  "com.es.scala.chapter04.Newton2" should {
    "extract square root with tracing" in {
      abs(new Newton2().sqrt(.01) - .1) must be <= .1
    }
  }

  "com.es.scala.chapter04.Newton3" should {
    "also extract sqrt - it is just a rewrite with nested functions" in {
      abs(new Newton3().sqrt(.01) - .1) must be <= .1
    }
  }

  "com.es.scala.chapter04.Newton4" should {
    "do the same sqrt, just more concise" in {
      abs(new Newton4().sqrt(.01) - .1) must be <= .1
    }
  }
}


