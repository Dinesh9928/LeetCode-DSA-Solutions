import scala.collection.mutable.ListBuffer

object Solution {
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    val ans = ListBuffer[Int]()
    var top = 0
    var left = 0
    var bottom = matrix.length - 1
    var right = matrix(0).length - 1
    var direction = 0

    while (top <= bottom && left <= right) {
      direction match {
        case 0 =>
          for (i <- left to right) {
            ans += matrix(top)(i)
          }
          top += 1
        case 1 =>
          for (i <- top to bottom) {
            ans += matrix(i)(right)
          }
          right -= 1
        case 2 =>
          for (i <- right to left by -1) {
            ans += matrix(bottom)(i)
          }
          bottom -= 1
        case 3 =>
          for (i <- bottom to top by -1) {
            ans += matrix(i)(left)
          }
          left += 1
      }
      direction = (direction + 1) % 4
    }
    ans.toList
  }
}
