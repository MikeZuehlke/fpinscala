/* Write a recursive function to get the n-th Fibonacci number.
 *  Use a local tail recursive funciton
 */
object Exercise0201 {

  def fib(n: Int) : Int = {
        
    def go(i: Int, x: Int, y: Int) : Int = {
      
      if (i == 0) 
        x
      else
        go (i-1, y, x + y)
    }
    
    go(n, 0, 1)

  }
  
  def main(args: Array[String]) = {
    (1 to 10).foreach(
        n => println(fib(n)))
  }
}
