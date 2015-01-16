package Exercises

class Count(val counter:Int) {

  //get rid of brackets when you type
  def inc: Count = dec()
  def dec: Count = inc()
  //val counter = count -- dont really do this in scala, but the way to do it is to create a new Counter each time.
  //use immutable structures to increment and decrement the counter.
  //now it takes in a value too!, defaults to 1.
  
  def dec (amount:Int = 1)= new Count (counter +amount)
  def inc (amount:Int = 1)= new Count (counter -amount)

  def adjust (adder:Adder) = new Count(adder.add(counter))
}

class Adder(amount:Int){
  def add(in:Int) = in + amount
  def apply (in:Int) = in+amount
}

  

