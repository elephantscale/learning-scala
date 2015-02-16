package com.es.scala.basics

object Arrays {
  def main(args: Array[String]) {

    // --- declarations ---
    var a = Array(1,2,3) // implicit type
    println ("int array a : " + a.mkString(","))
    // explicit type
    var b : Array[String] = Array("hello", "dear", "world")
    println ("string array b : " + b.mkString(","))

    // ---- access elements ---
    println ("a[first] :  " + a(0))
    println ("a[last] : " + a.last)
    println ("a[first two] : " + a.take(2).mkString(","))
    println ("a[last two] : " + a.takeRight(2).mkString(","))

    // --- modify the array ---
    b(1) = "dearest"
    println ("string array b after modification : " + b.mkString(","))


    // -- append
    var a2 = a :+ 4 // using :+  operator
    println ("array a2 : " + a2.mkString(","))
    println ("array a (unmodified) : " + a.mkString(","))
    a :+= 4 // modifying original array
    println ("array a (modified) : " + a.mkString(","))

    // -- prepend
    val a3 = 5 +: a   // using +: operator
    println ("array a3 (prepend 5) : " + a3.mkString(","))
  }

}
