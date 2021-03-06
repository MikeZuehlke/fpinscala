/**
 * Write a function which removes the last element
 * from a list.
 */
object Exercise0306 {

  def init[A](as: List[A]): List[A] = {
    as match {
      case Nil      => Nil
      case h :: Nil => Nil
      case h :: t   => h :: init(t)
    }
  }
   
  def main(args: Array[String]) = {
    println(init(Nil)              == Nil)
    println(init(List(1))          == Nil)
    println(init(List(1, 2, 3, 4)) == List(1,2,3))
  }
}
