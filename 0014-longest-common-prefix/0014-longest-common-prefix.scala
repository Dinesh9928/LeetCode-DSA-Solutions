object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {
        if (strs.isEmpty) return ""

        var pre = strs(0)
        var i = 1
        while (i < strs.length) {
          while (!strs(i).startsWith(pre)) {
            pre = pre.substring(0, pre.length - 1)
          }
          i += 1
        }
        pre
    }
}