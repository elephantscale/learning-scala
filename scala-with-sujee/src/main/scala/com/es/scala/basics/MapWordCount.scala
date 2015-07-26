package com.es.scala.basics

import scala.collection.mutable
import scala.util.control.Breaks._

object MapWordCount {
  def main(args: Array[String]) {
    val wordMap = new mutable.HashMap[String,Int]()
    println ("enter a few lines of text,  empty line to end...")

    breakable {
      for (line <- io.Source.stdin.getLines) {
        if (line.length() == 0) {
          break
        }
        for(word <- line.split(" ")) {
          var count = wordMap.getOrElse(word, 0)
          wordMap(word) = count+1
          println (word + " : " + wordMap(word))
        }
      }
    }
    println ("word count : " + wordMap)
  }

}
