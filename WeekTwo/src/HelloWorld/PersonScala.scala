package HelloWorld

class PersonScala {
  val first = "Fred"
  val last = "jones"
  def name = first +"" +  last

}

//type this is the interpreter/commandline

val cricketer = new PersonScala

cricketer.first
cricketer.name

val cloneofFreddie = new PersonScala

class PersonScala (first:String, last:String){
val firstname = first
val lastname = last
def name = first + "" + last

}

//interpreter
val david = new PersonScala("David"+"Cameron")
//val is immutable so they define the fields in the class for us.

david.name
//String = David Cameron

class Person(val firstname :String, val lastname:String){
 def name = firstname + " " + lastname
}

new Person("David", "Gower").name
//String David Gower


def greeting(firstName:String = "some", lastname:String = "body")= 
  "hellow " + firstName + lastname + "!"
  greeting ()
  greeting (" Fred")
  greeting (lastname = " Dude")
  
  
  //////EXCEPTIONS
  
type throw new Exception("ahhhhhhhh")
//Nothing -- so nothing starts at the 
//bottom of the pyramid and the Any starts at the top.
//they meet in the middle.
  
  
  
  
  
  
