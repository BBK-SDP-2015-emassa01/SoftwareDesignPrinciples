package HelloWorld

object First{
println ("Welcome to my Worksheet")
3+3
7.min(6).min(5)
if(10>14) "left" else "right"
if (10>14) "left"
println("string and something" + "something else" + 34)

"hello World".toUpperCase() //> res4: String = HELLO WORLD
"hello world".toUpperCase //> res5: String = HELLO WORLD

//2 / 0 cannot devide by 0

"aghjaghjgajgaj".take(3) //> res6: String = agh

"hello".toUpperCase.toLowerCase //> res7: String = hello

"a day at the zoo is a wonderful thing" split ""

Array [String] = Array (a, day, at, the, zoo, is , a, wonderful, thing)

s(0) = a
s(1) = day
s(2) = at

null = Null //has null but in Scala we prefer to use the optio type

type() //is of type unit

println("asdsahj") //result string, but 
type println("sadasas")
//returns type Unit


Object Test {} //created an object, defined it

Test
//test type = Test.dkjasdksajdsakj (memory location)
//You cannot use 'new' on these things

object Test2 {
def name: String = "something"
}
Test2.name //gives String = something

object Test3 {
def(hello:String )= //could define that it returns a String
"Hello"+name
}
Test3.hello("Freddie") //replies with a String (return value inferred)

//without a return statement

object Test5 {
val name = "noel"
def hello(other : String)=
name + "says hi to" + other
}
Test5.hello("liam")
//result String =  noel says hi to liam


///////////
assert (square(2.0) == 4.0)
assert (square(3.0) == 9.0)

def square(in:Double): Double = {return 3.0}//but 3 may be wrong
def square(in:Double): Double = ??? //this checks that the right value type is returned
// ??? is nothing, can be used...

def square(in:Double): Double = in*in


{
println("side effect")
} 
//prints out side effect, Unit type

{
println("side effect")
3
}
//result is an Int, there are 2 things (println is Unit, and 3 is Int)

if (1>2) "alien" else "predator"
//result String = predator
//result is of type String

if (1>2) "alien" else 2001
//result is Any = () 2001, it returns the common type between String/ref and val

 if (1>2) "alien" 
 //result Any = "alien"// because Unit is of type Any




}