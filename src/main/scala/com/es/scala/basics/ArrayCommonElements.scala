package com.es.scala.basics

object ArrayCommonElements {
  def main(args: Array[String]) {
    val a1 = Array(1,2,3,4,5,6,7)
    val a2 = Array (1,3,5,7)
    println ("a1 : " + a1.mkString(","))
    println ("a2 : " + a2.mkString(","))

    for (i <- a1 ) {
      if (a2.contains(i))
        println (i + " exists on both arrays")

      }
    }
}
