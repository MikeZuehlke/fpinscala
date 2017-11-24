/* Write a function which expects a function f of two arguments 
 * that returns a function with one argument that partially applies f.
 */
object Exercise0203 {

  def curry[A,B,C](f: (A,B) => C) : A => (B => C) = {
    a => b => f(a,b)      
  }
   
  val add = (x: Int, y: Int) => x + y

  def main(args: Array[String]) = {
    println(curry(add)(2: Int)(4: Int))
  }  
}
