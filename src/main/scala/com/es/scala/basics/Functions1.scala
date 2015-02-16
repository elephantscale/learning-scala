package com.es.scala.basics

object Functions1 {

  def main(args: Array[String]) {
    println(greeting("sujee"))
    println ("max(7,2) = "+ max(7,2))
    println (sayHello("Sujee"))
  }

  // (string) --> string
  def greeting(name : String) = {
    "hello there, " + name
  }

  //  (Int, Int) -> Int
  def max (x:Int, y:Int) : Int = {
    if (x > y) x else y
  }

  // (String) -> Unit
  def sayHello(name : String) : Unit = {
    println ("hello " + name)
  }

}
