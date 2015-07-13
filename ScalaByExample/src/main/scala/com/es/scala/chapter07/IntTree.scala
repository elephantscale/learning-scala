package com.es.scala.chapter07

/**
 * Created by mark on 7/13/15.
 */
abstract class IntTree {
  def contains(t: IntTree, v: IntTree): Boolean = t match {
    case EmptyTree => true
    case Node(elem, left, right) => true
  }
}

case object EmptyTree extends IntTree {

}

case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree {

}
