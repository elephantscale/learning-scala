package com.es.scala.basics

object ForLoop {

  def forLoopTo(n: Int) = {
    println("forLoopTo....")
    var i = 0 // has to be declared as VAR upfront
    for (i <- 1 to n) {
      println("i = " + i)
    }
  }

  // will go upto n, not including n
  def forLoopUntil(n: Int) = {
    println("forLoopUntil...")
    var i = 0
    for (i <- 1 until n)
      println("i = " + i)
  }


  def forLoopSkip(n: Int, skip: Int) = {
    println("forLoopSkip...")
    var i = 0
    for (i <- 1 to n by skip)
      println("i = " + i)

  }


  def main(args: Array[String]) = {

    // ------------------------
    println("----- forLoop Numbers To (loops upto a number, including that number)")
    for (i <- 1 to 10) {
      println("i = " + i)
    }
    // ------------------------


    // ------------------------
    {
      println("----- Loop over array imperative style")
      val arr = Array(1, 2, 3, 4, 5)
      for (i <- 0 until arr.length) {
        println(arr(i))
      }
    }
    // ------------------------

    // ------------------------
    {
      println("----- Loop over array for scala style")
      val arr = Array(1, 2, 3, 4, 5)
      for (a <- arr)
        println(a)
    }
    // ------------------------

    // ------------------------
    {
      println("----- Loop over array foreach scala style")
      val arr = Array(1, 2, 3, 4, 5)
      arr.foreach ((x: Int) => println (x))
      arr.foreach (println)
    }
    // ------------------------
  }
}
