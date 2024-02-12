object Solution {
  def convert(s: String, numRows: Int): String = {
    if (numRows == 1) return s

    val rows = Array.fill(numRows)(new StringBuilder())

    var curRow = 0
    var goingDown = false

    for (c <- s.toCharArray) {
      rows(curRow).append(c)
      if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown
      curRow += (if (goingDown) 1 else -1)
    }

    val ret = new StringBuilder()
    for (row <- rows) {
      ret.append(row)
    }
    ret.toString
  }
}