object Chapter14 { 
  def pairSwap (pair: (Int, Int)): (Int, Int) =
    pair match { case (a, b) => (b, a) }

  def arraySwap (array: Array[Int]): Array[Int] =
    array match { 
      case Array (x, y, _*) => Array (y, x) ++ array.drop (2)
      case _ => array
    }
}
