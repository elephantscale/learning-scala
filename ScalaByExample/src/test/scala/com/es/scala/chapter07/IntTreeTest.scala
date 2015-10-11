package com.es.scala.chapter07

import org.specs2.mutable.Specification

class IntTreeTest extends Specification {
  "com.es.scala.chapter07.IntTree" should {
    "confirm that the EmptyTree does not contain any element" in {
      val instance = Node(5, EmptyTree, EmptyTree)
      instance.contains(EmptyTree, 5) mustEqual(false)
    }
    "confirm that a tree with one element contains that element" in {
      val instance = Node(1, EmptyTree, EmptyTree)
      instance.contains(instance, 1) mustEqual(true)
    }
    "confirm that a tree with two elements contains both of them" in {
      val instance = Node(1, EmptyTree, EmptyTree)
      val instance2 = Node(2, instance, EmptyTree)
      instance.contains(instance2, 2) mustEqual(true)
      instance.contains(instance2, 1) mustEqual(true)
    }
    "confirm that a tree with multiple elements contains every one of them" in {
      val instance = Node (3, Node(1, EmptyTree, EmptyTree), Node(2, EmptyTree, EmptyTree))
      instance.contains(instance, 1) mustEqual(true)
      instance.contains(instance, 2) mustEqual(true)
      instance.contains(instance, 3) mustEqual(true)
    }
    "by the way, confirm that case classes allow to easily reference what went into their constructor" in {
      val instance = Node (3, Node(1, EmptyTree, EmptyTree), Node(2, EmptyTree, EmptyTree))
      instance.elem mustEqual 3
      instance.left mustEqual(Node(1, EmptyTree, EmptyTree))
      instance.right mustEqual(Node(2, EmptyTree, EmptyTree))
    }
  }
}
