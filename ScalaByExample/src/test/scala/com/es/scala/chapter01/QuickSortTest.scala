package com.es.scala.chapter01

import org.specs2.mutable._

/**
 * Created by mark on 11/30/14.
 */
class QuickSortTest extends Specification {

  // Note that QuickSort1 changes the input array - not functional programming
  val intArray1 = Array(3, 2, 1)
  val intArraySorted = Array(1, 2, 3)
  "com.es.scala.chapter01.QuickSort1" should {
    "sort the array of integers" in {
      new QuickSort1().sort(intArray1)
      intArray1 mustEqual (intArraySorted)
    }
  }

  // Note that QuickSort2 returns a new array, leaving the input one unchanged
  val intArray2 = Array(3, 2, 1)
  "com.es.scala.chapter01.QuickSort2" should {
    "sort the array of integers better" in {
      new QuickSort2().sort(intArray2) mustEqual (intArraySorted)
    }
  }
}
