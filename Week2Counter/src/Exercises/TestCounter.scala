package Exercises

object TestCounter{
  
  def main(args: Array[String]) = {
    println( new Count(10).inc().inc(5).dec(2).counter)
    println( new Count(10).inc.inc(5).dec(2).dec.counter)//no ()
    println( new Adder(5).add(2))
    
    val item = new Adder(5)
    item.add(2)//can do this
    println(item(2))//inserts the apply method for us, ie., Adder(5) + apply(2)
  }

}