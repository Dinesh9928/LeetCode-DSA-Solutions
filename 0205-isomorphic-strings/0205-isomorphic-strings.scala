import scala.collection.mutable.HashMap

object Solution {
  def isIsomorphic(s: String, t: String): Boolean = {
    val hm1 = HashMap[Char, Char]()
    val hm2 = HashMap[Char, Char]()

    for (i <- 0 until s.length) {
      val a = s(i)
      val b = t(i)

      if (!hm1.contains(a)) {
        hm1.put(a, b)
      }
      if (!hm2.contains(b)) {
        hm2.put(b, a)
      }

      if (hm1(a) != b || hm2(b) != a) {
        return false
      }
    }
    true
  }
}
