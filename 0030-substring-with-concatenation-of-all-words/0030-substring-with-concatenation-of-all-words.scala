import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map

object Solution {
  def findSubstring(s: String, words: Array[String]): List[Int] = {
    val result = ListBuffer[Int]()

    if (s == null || words == null || words.isEmpty) {
      return result.toList
    }

    val n = s.length
    val m = words.length
    val len = words(0).length

    val map = Map[String, Int]()
    for (word <- words) {
      map(word) = map.getOrElse(word, 0) + 1
    }

    var i = 0
    while (i <= n - m * len) {
      val seen = Map[String, Int]()
      var j = 0
      var found = true

      while (j < m && found) {
        val k = i + j * len
        val sub = s.substring(k, k + len)

        if (!map.contains(sub)) {
          found = false
        } else {
          seen(sub) = seen.getOrElse(sub, 0) + 1

          if (seen(sub) > map(sub)) {
            found = false
          }
        }
        j += 1
      }

      if (found) {
        result += i
      }
      i += 1
    }
    result.toList
  }
}
