class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        int i =1;
        while(i<strs.length){
            if(strs[i].startsWith(pre)){
                i++;
            }
            else{
                pre = pre.substring(0, pre.length()-1);
            }
        }
        return pre;
    }
}