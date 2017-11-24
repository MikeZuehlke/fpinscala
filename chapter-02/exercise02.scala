/* Write a function that checks whether an array is sorted
 * according to a given comparison function.
 */
object Exercise0202 {

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean) : Boolean = {
        
    (0 to as.length - 2)
      .map(i => ordered(as.apply(i), as.apply(i+1)))
      .foldLeft(true)(_ && _)
  }
   
  def main(args: Array[String]) = {
    println(isSorted(Array(1),          ord) == true)
    println(isSorted(Array(1, 2),       ord) == true)
    println(isSorted(Array(1, 2 ,3),    ord) == true)
    println(isSorted(Array(2, 1),       ord) == false)
    println(isSorted(Array(1, 2, 4, 3), ord) == false)
  }
  
  def ord(x: Int, y: Int): Boolean = x <= y
}
