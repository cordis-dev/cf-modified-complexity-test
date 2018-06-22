// https://github.com/scalastyle/scalastyle/blob/master/src/main/scala/org/scalastyle/scalariform/CyclomaticComplexityChecker.scala - countCases
object HelloWorld {
  val Constant = 'Q'
  def tokenMe(ch: Char) = (ch: @switch) match {
    case ' ' | '\t' | '\n'  => 1
    case 'A' | 'Z' | '$'    => 2
    case '3'                => 3
    case '4'                => 4
    case '5'                => 5
    case '6'                => 6
    case '7'                => 7
    case '8'                => 8
    case '9'                => 9
    case '0'                => 10
    case '1'                => 11
    case '<'                => 12
    case '>'                => 13
    case '/'                => 14
    case _                  => 16
  }
}