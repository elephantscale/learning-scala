class GreetingMultiple (name : String, times: Int) {

  def this(name : String) = this(name, 1) // call the constructor with 1 count

  def greet() = {
    for (i <- 1 to times ) {
      println ("hello " + name)
    }
  }
}

/*
run the lines below in Scala shell
val g3 = new GreetingMultiple("sujee", 3)
g3.greet()
val g1 = new GreetingMultiple("mark")
g1.greet()
*/