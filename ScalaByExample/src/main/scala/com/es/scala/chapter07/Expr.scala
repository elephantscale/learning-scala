package com.es.scala.chapter07

/**
 * Created by mark on 7/13/15.
 */
abstract class Expr {
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(l, r) => eval(l) + eval(r)
  }
}

case class Number(n: Int) extends Expr {

}

case class Sum(e1: Expr, e2: Expr) extends Expr {

}
