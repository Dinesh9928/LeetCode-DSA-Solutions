object Solution {
    def strStr(haystack: String, needle: String): Int = {
        val n = needle.length
        val m = haystack.length
        for (i <- 0 until m - n + 1) {
          if (haystack.substring(i, i + n) == needle) {
            return i
          }
        }
        -1
    }
}