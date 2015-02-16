// run it in command line :    $ scala  GreetingConstructor
class GreetingConstructor(name: String) {
  def greet() = {
    println("hello " + name)
  }
}

/*
run the lines below in Scala shell
val g = new GreetingConstructor("sujee")
g.greet()
*/