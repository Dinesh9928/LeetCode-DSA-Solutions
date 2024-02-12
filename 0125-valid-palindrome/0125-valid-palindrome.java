class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() -1;
        
        while(start<=end){
            char I = s.charAt(start);
            char J = s.charAt(end);
            if(!Character.isLetterOrDigit(I)){
                start++;
            }
            else if(!Character.isLetterOrDigit(J)){
                end--;
            }
            else{
                if(Character.toLowerCase(I)!= Character.toLowerCase(J)){
                    return false;
                }
                else{
                    start++;
                    end --;
                }
            }
        }
        return true;
    }
}