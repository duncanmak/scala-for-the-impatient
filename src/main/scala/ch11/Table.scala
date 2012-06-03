// Provide operators that construct an HTML table. For example,
//
// Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
//
// should produce
//
// <table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling</td><td>Odersky</td></tr><tr><td>JVM</td><td>JVM,.NET</td></tr></table>

class Table (rows: List[List[String]]) {
  def |  (e : String) = new Table ((rows init) :+ ((rows last) :+ e))
  def || (e : String) = new Table (rows :+ List (e))
  override def toString =
    "<table>" + (rows.map (tr => "<tr>" + (tr.map (td => "<td>" + td + "</td>") mkString) + "</tr>") mkString) +"</table>"
}

object Table {
  def apply () = new Table (List (List ()))
}

object Main extends App {
  Console.println (Table () | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET")
}


