class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0;
        int j = nums.length -1;
        int sum = 0;
        int[] res = new int[2];
        while(i<j){
            sum = nums[i] + nums[j];
            if(sum == target){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
            else if (sum < target){
                i++;
            }
            else {
                j--;
            }
        }
        return res;
    }
}