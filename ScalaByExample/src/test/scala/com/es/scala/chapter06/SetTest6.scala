package com.es.scala.chapter06

import org.specs2.mutable.Specification

class SetTest6 extends Specification {
  "com.es.scala.chapter06.IntSet6" should {
    "verify that no element belongs to EmptySet" in {
      new EmptySet6().contains(1) must beFalse
    }
    "verify that correct elements belong to NonEmptySet" in {
      val set = new EmptySet6
      val set1 = set.incl(3)
      set1.contains(1) must beFalse
      set1.contains(3) must beTrue
    }
    "verify that union works as expected" in {
      val set = new EmptySet6
      val set1 = set.incl(3).incl(5).incl(1)
      val set2 = set.incl(4).incl(2)
      val set3 = set1.union(set2)
      set3.contains(1) must beTrue
      set3.contains(2) must beTrue
      set3.contains(3) must beTrue
      set3.contains(4) must beTrue
      set3.contains(5) must beTrue
    }
    "verify that intersection works as expected" in {
      val set = new EmptySet6
      val set1 = set.incl(1).incl(3).incl(4).incl(5)
      println("set1 = " + set1.toString)
      val set2 = set.incl(3).incl(4)
      println("set2 = " + set2.toString)
      val set3 = set1.intersection(set2)
      println("set3 = " + set3.toString)
      println("")
      set3.contains(1) must beFalse
      set3.contains(2) must beFalse
      set3.contains(3) must beTrue
      set3.contains(4) must beTrue
      set3.contains(5) must beFalse
      set3.intersection(set).contains(1) must beFalse
    }
  }
}

