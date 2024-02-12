object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
        val arr = Array.fill(256)(-1)
        val n = s.length
        var start = -1
        var MaxLen = 0

        for(i <- 0 until n){
            if(arr(s.charAt(i)) > start){
                start = arr(s.charAt(i))
            }
            arr(s.charAt(i)) = i
            MaxLen = Math.max(MaxLen, i - start)
        }
        return MaxLen
    }
}