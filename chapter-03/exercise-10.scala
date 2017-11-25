/**
 * Write the (tail recursive) function foldLeft.
 */
object Exercise0310 {

  def foldLeft[A,B](as: List[A], b: B)(f: (B,A) => B): B = {
    
    def go(as: List[A], acc: B): B = {
      as match {
        case Nil    => acc
        case h :: t => go(t, f(acc, h))
      }  
    }
    
    go(as, b)
  }
    
  def foldRight[A,B](as: List[A], b: B)(f: (A,B) => B): B = {
    as match {
      case Nil => b
      case h :: t => f(h, foldRight(t, b)(f))
    }
  }
  
      

  def main(args: Array[String]) = {
    
    println(foldLeft (Nil                 , 0)(add) == 0)
    println(foldLeft (List.range(1, 11000), 0)(add) == 60494500)
    println(foldRight(List.range(1, 11000), 0)(add) == 60494500)
  }
  
  def add(x: Int, y: Int) : Int = x + y
}
