/**
 * Write a function which updates the head of a list.
 */
object Exercise0303 {

  def setHead[A](a: A, as: List[A]): List[A] = {
    as match {
      case Nil => Nil
      case h :: t => a :: t
    }
  }
   
  def main(args: Array[String]) = {
    println(setHead(7, List()       ) == List())
    println(setHead(5, List(1, 2, 3)) == List(5, 2, 3))
  }
}
