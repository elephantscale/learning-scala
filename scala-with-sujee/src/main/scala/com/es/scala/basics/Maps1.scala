package com.es.scala.basics

import scala.collection.mutable
import scala.collection.immutable

object Maps1 {
  def main(args: Array[String]) {

    // immutable
    val m1 = immutable.Map ("a" -> 1,  "b" -> 2)
    println (m1)
    println ("m1(a) : " + m1("a")) // --> 1
    // println (m1("c")) // --> exception
    println ("m1.getOrElese(c, -1) : " +  m1.getOrElse("c", -1))  // --> -1
    // m1("d") = 10 // error


    // empty mutable hashmap
    val m2 = new mutable.HashMap[String, Int]()
    // add elements
    m2 += "a" -> 1
    m2 += "b" -> 2
    m2 += "c" -> 3
    println("m2 : " + m2)
  }

}
