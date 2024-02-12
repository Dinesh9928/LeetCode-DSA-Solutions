class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int ele = Integer.MIN_VALUE;

        for(int i: nums){
            if(count ==0){
                ele = i;
                count++;
            }
            else if(ele==i)
                count++;
            else
                count--;
        }
        return ele;
    }
}