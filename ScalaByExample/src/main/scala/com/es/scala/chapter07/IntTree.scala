package com.es.scala.chapter07

abstract class IntTree {
  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case Node(elem, left, right) => elem == v || contains(left, v) || contains(right, v)
  }
}
case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree
