class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n==0) return true;
        if(n>m) return false;
        int i=0,j=0;
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j))
                i++;
            if(i==n)
                return true;
            j++;
        }
        return false;
    }
}