package com.es.scala.chapter02

import org.specs2.mutable._

class QuickSortTest extends Specification {

  // Note that QuickSort1 changes the input array - not functional programming
  val intArray1 = Array(3, 2, 1, 10, 5)
  val intArraySorted = Array(1, 2, 3, 5, 10)
  "com.es.scala.chapter01.QuickSort1" should {
    "sort the array of integers" in {
      new QuickSort1().sort(intArray1)
      intArray1 mustEqual (intArraySorted)
    }
  }

  // Note that QuickSort2 returns a new array, leaving the input one unchanged
  val intArray2 = Array(3, 2, 1, 10, 5)
  "com.es.scala.chapter01.QuickSort2" should {
    "sort the array of integers using functional style" in {
      new QuickSort2().sort(intArray2) mustEqual (intArraySorted)
    }
  }
}
