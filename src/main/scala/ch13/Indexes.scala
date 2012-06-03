import scala.collection.mutable

object Chapter13 {
  //
  // Write a function that, given a string, produces a map of the
  // indexes of all the characters.
  //
  // For example, indexes ("Mississippi") should return a map
  // associating 'M' with the set {0}, 'i' with the set {1, 4, 7, 10},
  // and so on. Use a mutable map of characters to mutable sets.  How
  // can you ensure that the set is sorted?
  //
  def mutableStringToIndex (s: String) : mutable.Map[Char, mutable.Set[Int]] = {
    val result = mutable.Map[Char, mutable.Set[Int]]()
    s.zipWithIndex.foreach {
      case (c, i) => {
        if (result.contains (c))
          result (c) += i
        else
          result (c) = mutable.Set (i)
      }}

    return result
  }

  //
  // Repeat the preceding exercise, using an immutable map of characters to lists.
  //
  def stringToIndex (s: String) : Map[Char, Set[Int]] = {
    val initial = Map[Char, Set[Int]]()
    (initial /: s.zipWithIndex) {
      case (m, (letter, index)) => m + (letter -> ((m.getOrElse (letter, Set())) + index))
    }
  }

  def stringToIndex2 (s: String) : Map[Char, Set[Int]] = {
    s.zipWithIndex.groupBy (_._1).mapValues (_.map (_._2).toSet)
  }
}
