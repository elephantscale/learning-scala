package com.es.scala.basics

object CommandLineParams1 {
  def main(args: Array[String]) {
    var x = ""
    for (x <- args) {
      println ("%s  --> %s".format(x, x.toUpperCase()))
    }
  }

}
