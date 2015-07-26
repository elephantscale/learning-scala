trait Friendly {
  def greet() = {
    "Hi"
  }
}

class Animal extends Friendly {

}

class Dog extends Friendly {
  override def greet () = {
    "Woof"
  }
}

class Cat extends Friendly {
  override def greet() = {
    "Meow"
  }
}
/*
run the lines below in Scala shell


println ("Animal says : " + new Animal().greet())
println ("Dog says : " + new Dog().greet())
println ("Cat says : " + new Cat().greet())
*/