package com.es.scala.more

/**
 * Created by mark on 12/4/14.
 */
class UseOfNull {

  /**
   * returns null if given null
   * but nulls are bad
   * @param x
   * @return
   */
  def exampleOfNull(x: List[String]): String = {
    if ( x != null) {
      x.head
    }
    else null
  }

  /**
   * Returns an empty list when given an empty list
   * That is better
   * @param x
   * @return
   */
  def exampleOfNil(x: List[String]): List[String] = {
    if ( x != Nil) {
      List(x.head)
    }
    else Nil
  }

  /**
   * Use of ??? to denote "not implemented yet"
   * @param a
   * @return
   */
  def notImplemented(a: Int): Int = ???
}
