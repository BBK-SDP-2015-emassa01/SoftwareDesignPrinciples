package exercises

class Counter(val counter:Int) {

  //val counter = count -- dont really do this in scala, but the way to do it is to create a new Counter each time.
  //use immutable structures to increment and decrement the counter.
  
  def dec= new Counter (counter +1)
  def inc= new Counter (counter -1)


}


/*constructor takes an int
 * has methods inc and dec, that increment and decrement the counter and return a new counter.
 * 
 * new counter(10).inc.dec.inc.inc.count //tells us current value of counter
 */


/*REPL
 * :paste in the REPL means you can press enter and it doesnt complain, you have to do CTRL+D
 */
