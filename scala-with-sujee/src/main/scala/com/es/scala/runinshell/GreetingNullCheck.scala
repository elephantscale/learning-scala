class GreetingNullCheck(name : String) {
  if (name == null)
    throw new NullPointerException("name is null")

  def greet() = {
    println("hello " + name)
  }
}

/*
run the lines below in Scala shell

val g1 = new GreetingNullCheck("sujee")
g1.greet()

val g2 = new GreetingNullCheck(null)  // exception will be thrown
g2.greet()
*/