package com.es.scala.basics

import util.control.Breaks._

object ListReverseInput {
  def main(args: Array[String]) {
    println ("enter a few lines of text,  empty line to end...")

    var list: List[String] = List()
    breakable {
      for (line <- io.Source.stdin.getLines) {
        if (line.length() == 0) {
          break
        }
        list = line :: list
      }
    }
    println("---- printing in LIFO order ---")
    println(list)
    println("---- de-dupe ---")
    println(list.distinct)
  }

}
