package com.es.scala.basics

// declare variables
object Variables {
  def main(args: Array[String]) {

    // ---- explicitly declaring types ----
    // int
    val b : Byte = 0x1  // byte  (1 byte)
    val sh : Short = 8 // short  (2 bytes)
    val i : Int = 10  // int  (4 bytes)
    val lo : Long = 10L // long.. notice the L (8 bytes)

    // float
    val f : Float = 10.0f // float (4 bytes)
    val d : Double = 10.0 // double (8 bytes)

    // string
    val c : Char = 'c'  // char  (2 bytes)
    val s : String = "hello"  // string (sequence of chars)

    // bool
    val bo : Boolean = true //  true / false

    val any : Any = new Object()


    // ------ type infering ----
    val aa = 10  // int
    val bb = 10.0   // double
    val  ss = "hello world"  // string


    // ---- val / var
    var x = 10
    x = 20 // this is fine

    val y = 100
    // y = 200  this is an error, can not re-assign val


  }

}
