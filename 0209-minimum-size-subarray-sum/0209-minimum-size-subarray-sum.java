class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int total =0, left =0, right=0;
        int res = Integer.MAX_VALUE;
        int n = nums.length;

        while(left<=right && right < n){

            total += nums[right];
            while(total>=target){

                res = Math.min(res, right-left + 1);
                total -= nums[left++];
            }
            right++;
        
        }
        if(res != Integer.MAX_VALUE) 
            return res;
        else
            return 0;
    }
}