class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int res = 0, tempArea = 0;
        int l = 0, r = n-1;

        while(l<r){
            tempArea = Math.min(height[r], height[l])*(r-l);
            res = Math.max(res, tempArea);

            if(height[l]> height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return res;
    }
}