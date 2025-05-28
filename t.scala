object HelloWorld {
  val Constant = 'Q'

  def matchCaseTest(ch: Char) = (ch: @switch) match {
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

  def ifElseTest(ch: Char): Int = {
    if (ch == ' ' || ch == '\t' || ch == '\n') 1
    else if (ch == 'A' || ch == 'Z' || ch == '$') 2
    else if (ch == '3') 3
    else if (ch == '4') 4
    else if (ch == '5') 5
    else if (ch == '6') 6
    else if (ch == '7') 7
    else if (ch == '8') 8
    else if (ch == '9') 9
    else if (ch == '0') 10
    else if (ch == '1') 11
    else if (ch == '<') 12
    else if (ch == '>') 13
    else if (ch == '/') 14
    else 16
  }
}
