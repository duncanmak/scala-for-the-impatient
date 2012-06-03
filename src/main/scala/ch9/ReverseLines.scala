import scala.io.Source

object Chapter9 {
  def reverseLines (filename: String): String = {
    Source.fromFile (filename).getLines.toSeq.reverse.mkString ("\n")
  }
}
