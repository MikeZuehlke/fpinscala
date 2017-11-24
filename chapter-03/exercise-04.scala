/**
 * Write a function which removes the first n elements from a list.
 */
object Exercise0304 {

  def drop[A](as: List[A], n: Int): List[A] = {
    
    def go(as: List[A], n: Int): List[A] = {
    
      if (n == 0)
        as
      else
        as match {
          case Nil    => Nil
          case _ :: t => go(t, n-1)
        }
    }
    
    go(as, n)
  }
   
  def main(args: Array[String]) = {
    println(drop(List(), 0) == List())
    println(drop(List(), 2) == List())
    
    println(drop(List(1, 2, 3), 0) == List(1, 2, 3))
    println(drop(List(1, 2, 3), 1) == List(2, 3))
    println(drop(List(1, 2, 3), 2) == List(3))
    println(drop(List(1, 2, 3), 3) == List())
    println(drop(List(1, 2, 3), 4) == List())
  }
}
