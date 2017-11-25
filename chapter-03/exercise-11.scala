/**
 * Write sum, product and length with foldLeft.
 */
object Exercise0311 {

  def sum(as: List[Int]) : Int = as.foldLeft(0)(_+_)
  
  def product(as: List[Int]) : Int = as.foldLeft(1)(_*_)
  
  def length[A](as: List[A]) : Int = as.foldLeft(0)( (n,_) => n + 1)
          
  def main(args: Array[String]) = { 
    println(sum(List.range(1, 101))   == 5050)
    println(product(List.range(1, 5)) == 24)
    println(length(List("A","B","C"))  == 3)
  }
}
