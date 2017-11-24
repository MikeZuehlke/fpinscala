/* Write a function which uncurries a partially applying function
 * into a function with two arguments.
 */
object Exercise0204 {

  def uncurry[A,B,C](f: A => B => C) : (A, B) => C = {
    (a,b) => f(a)(b)        
  }
   
  val add = (x: Int) => (y: Int) => x + y

  def main(args: Array[String]) = {
    println(uncurry(add)(2, 4))
  }  
}
