object Solution {
    def isPalindrome(s: String): Boolean = {
        var start = 0
        var end = s.length - 1

        while(start <= end){
            val i = s.charAt(start)
            val j = s.charAt(end)

            if(!Character.isLetterOrDigit(i)){
                start +=1
            }
            else if(!Character.isLetterOrDigit(j)){
                end -=1
            } 
            else{
                if(Character.toLowerCase(i) != Character.toLowerCase(j)){
                    return false
                }
                else{
                    start +=1
                    end -=1
                }
            }
        }
        true
    }
}