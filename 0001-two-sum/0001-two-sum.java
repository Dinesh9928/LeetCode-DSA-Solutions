class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> h1= new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        for(int i =0; i<nums.length; i++){
            int val = target -nums[i];
            if(!h1.containsKey(val))
                h1.put(nums[i], i);
            else{
                ans[0]=i;
                ans[1]= h1.get(val);
                return ans;
            }
        }
        return ans;
        
    }
}