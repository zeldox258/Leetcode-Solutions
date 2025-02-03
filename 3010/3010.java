class Solution {
    public int minimumCost(int[] nums) {
        int min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(min2>nums[i]){
                min1 = min2;
                min2=nums[i];
            }
            else if(min1>nums[i]){
                min1 = nums[i];
            }
        }
        return nums[0]+min1+min2;
    }
}