object Solution {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        val size = magazine.length()
        val n = ransomNote.length()

        if (n > size)
            false

        var map = Map[Char, Int]()

        for (i <- 0 until size) {
            val ch = magazine.charAt(i);
            map = map + (ch -> (map.getOrElse(ch, 0) + 1))
        }
        for (i <- 0 until n) {
            val ch = ransomNote.charAt(i)
            if (map.contains(ch)) {
                if (map(ch) > 0) {
                    map = map + (ch -> (map(ch) - 1))
                } else {
                    return false
                }
            } else {
                 return false
            }
        }
        true
    }
}