/**
 * Write a function which removes elements from the
 * beginning of a list as long as they fulfil a given
 * predicate.
 */
object Exercise0304 {

  def dropWhile[A](as: List[A], p: A => Boolean): List[A] = {
    
    def go(as: List[A]): List[A] = 
      as match {
        case Nil    => Nil
        case h :: t => if (p(h)) 
                          go(t)
                       else
                          as
                          
      }
    
    go(as)
  }
   
  def main(args: Array[String]) = {
    val pred = (x: Int) => x <= 4
    
    println(dropWhile(List(), pred) == List())
    
    println(dropWhile(List(1, 3, 7, 9), pred) == List(7, 9))
    println(dropWhile(List(7, 9, 1, 3), pred) == List(7, 9, 1, 3))
  }
}
