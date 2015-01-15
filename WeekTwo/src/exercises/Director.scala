package exercises

class Director(
    val firstName:String, 
    val lastName:String, 
    val yearOfBirth: Int) {

  def name:String = 
    firstName + " " + lastName //this is OK

    //or
    
    s"$firstName $lastName"
    
    def copy(
    firstName:String = this.firstName, 
    lastName:String = this.lastName, 
    yearOfBirth: Int = this.yearOfBirth
    ) = new Director (firstName, lastName, yearOfBirth)
    
}

/*Director
*firstName Stirng
*lastName String
*yearOfBirth Int
*METHOD called name no parameters --> full name
*/