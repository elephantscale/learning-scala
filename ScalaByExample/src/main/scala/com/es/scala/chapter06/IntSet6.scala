package com.es.scala.chapter06

/**
 * Additions: (Exercises 6.0.1 and 6.0.2) - union, intersection, excl
 */
trait IntSet6 {

  def contains(x: Int): Boolean

  def incl(x: Int): IntSet6

  def union(s: IntSet6): IntSet6

  def intersection(s: IntSet6): IntSet6

  def isEmpty: Boolean

  override def toString(): String
}

class NonEmptySet6(elem: Int, left: IntSet6, right: IntSet6) extends IntSet6 {
  def top: Int = elem

  def myLeft: IntSet6 = left

  def myRight: IntSet6 = right

  def isEmpty: Boolean = false

  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet6 = {
    if (x < elem) new NonEmptySet6(elem, left incl x, right)
    else if (x > elem) new NonEmptySet6(elem, left, right incl x)
    else this
  }

  override def toString(): String = {
    if (isEmpty) ""
    else {
      val mySet = asInstanceOf[NonEmptySet6]
      mySet.top + " " + mySet.myLeft.toString + " " + mySet.myRight.toString
    }
  }

  def union(s: IntSet6): IntSet6 = {
    if (s.isEmpty) this
    else incl(s.asInstanceOf[NonEmptySet6].top).
      union(s.asInstanceOf[NonEmptySet6].myLeft).
      union(s.asInstanceOf[NonEmptySet6].myRight)
  }

  def intersection(s: IntSet6): IntSet6 =
    if (s.isEmpty) s
    else {
      val mySet = s.asInstanceOf[NonEmptySet6]
      if (contains(mySet.top))
        intersection(mySet.myLeft.union(mySet.myRight)).incl(mySet.top)
      else
        intersection(mySet.myLeft.union(mySet.myRight))
    }

}

class EmptySet6 extends IntSet6 {

  def top = None

  def contains(x: Int): Boolean = false

  def incl(x: Int): IntSet6 = new NonEmptySet6(x, new EmptySet6, new EmptySet6)

  def union(s: IntSet6): IntSet6 = s

  def intersection(s: IntSet6): IntSet6 = this

  def isEmpty = true

  override def toString(): String = ""
}