object SimpleSearch extends App {
  val text = "カワカドカドカドドワンゴカドカドンゴドワドワンゴドワカワカドンゴドワ".toSeq
  val pattern = "ドワンゴ".toSeq
  val matchIndexes = search(text, pattern)

  def search(text: Seq[Char], pattern: Seq[Char]): Seq[Int] = {
    var matchIndexes = Seq[Int]()
    for (i <- 0 until text.length) {
      val partText = text.slice(i, i + pattern.length)
      if (isMatch(partText, pattern)) matchIndexes = matchIndexes :+ i
    }
    matchIndexes
  }

  def isMatch(textPart: Seq[Char], pattern: Seq[Char]): Boolean = {
    var isMatch = true
    for (i <- 0 to pattern.length - 1) {
      if (textPart.length < pattern.length || textPart(i) != pattern(i)) {
        isMatch = false
      }
    }
    isMatch
  }

  println(s"出現箇所: ${matchIndexes}")
}