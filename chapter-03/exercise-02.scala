/**
 * Implement tail function.
 */
object Exercise0302 {

  def tail[A](as: List[A]): List[A] = {
    as match {
      case Nil => Nil // or throw new IllegalArgumentException
      case h :: t => t
    }
  }
   
  def main(args: Array[String]) = {
    println(tail(List())           == List())
    println(tail(List(1, 2, 3, 4)) == List(2, 3, 4))
  }
}
