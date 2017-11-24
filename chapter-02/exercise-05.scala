/* Write a high order function which composes two functions.
 */
object Exercise0205 {

  def andThen [A,B,C](f: A => B, g: B => C) : A => C = {
    a => g(f(a))
  }
   
  def main(args: Array[String]) = {
    println( (add2 andThen mul3) (4) == 18)
  }
  
  val add2 = (x: Int) => x + 2
  val mul3 = (x: Int) => x * 3
}
