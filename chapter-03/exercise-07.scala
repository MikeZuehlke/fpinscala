/**
 * Write product with foldRight.
 */
object Exercise0307 {

  def product(as: List[Int]): Int = 
    as match {
      case Nil => 0
      case _   => as.foldRight[Int](1)(_*_)
    }  

  def main(args: Array[String]) = {
    
    println(product(Nil)               == 0)
    println(product(List(1, 2, 3, 4)) == 24)
  }
}
