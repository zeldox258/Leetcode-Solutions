
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int res=0,dp=0;
        for(int i=2;i<nums.length;i++){if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])res+=++dp;else dp=0;}
        return res;
    }
}
