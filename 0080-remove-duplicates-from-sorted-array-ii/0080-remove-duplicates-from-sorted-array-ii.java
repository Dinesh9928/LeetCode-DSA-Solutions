class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int n = nums.length;

        for(int i=2; i< n; i++){
            if(nums[j-1] != nums[i])
                nums[++j] = nums[i];
        }
        return ++j;
    }
}