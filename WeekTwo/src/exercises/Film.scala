package exercises

class Film(
    val name:String, 
    val yearOfRelease: Int, 
    val imdbRating:Double, 
    val director: Director) {
  
  def directorsAge = yearOfRelease - director.yearOfBirth

  def isDirectedBy (director:Director) = this.director == director.name // eq is the .equals in Scala
  
  
  def copy ( 
      name:String = this.name, 
      yearOfRelease: Int = this.yearOfRelease, 
      imdbRating:Double = this.imdbRating, 
      director: Director= this.director) = new Film (name, yearOfRelease, imdbRating, director)
} //this is a deep copy, not a shallow memory reference copy



/*
Director
firstName Stirng
lastName String
yearOfBirth Int
METHOD called name no parameters --> full name
* 
Film
name String
yearOfRelease String
imdbRating Double
director Director
directorsAge -- age of director at the release date of the movie
isDirectedBy -- accepts a director as a parameter --> Boolean

copy method - accepts same formal parameters as cons --> new copy of the film
give each parameter default vales - the existing values for the film
*/
