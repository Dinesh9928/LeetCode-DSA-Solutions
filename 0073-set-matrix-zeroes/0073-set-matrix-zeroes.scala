object Solution {
  def setZeroes(matrix: Array[Array[Int]]): Unit = {
    var col0 = false
    val rows = matrix.length
    val cols = matrix(0).length

    // First pass to mark the rows and columns that need to be zeroed
    for (i <- 0 until rows) {
      if (matrix(i)(0) == 0) col0 = true
      for (j <- 1 until cols) {
        if (matrix(i)(j) == 0) {
          matrix(i)(0) = 0
          matrix(0)(j) = 0
        }
      }
    }

    // Second pass to zero out the marked rows and columns
    for (i <- (rows - 1) to 0 by -1) {
      for (j <- (cols - 1) until 0 by -1) {
        if (matrix(i)(0) == 0 || matrix(0)(j) == 0)
          matrix(i)(j) = 0
      }
      if (col0) matrix(i)(0) = 0
    }
  }
}
