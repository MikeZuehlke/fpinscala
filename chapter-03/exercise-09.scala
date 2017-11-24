/**
 * Write length with foldRight.
 */
object Exercise030ß {

  def length(as: List[Int]): Int = 
    as.foldRight[Int](0)((a,n) => n + 1)

  def main(args: Array[String]) = {
    
    println(length(Nil)              == 0)
    println(length(List(1, 2, 3, 4)) == 4)
  }
}
