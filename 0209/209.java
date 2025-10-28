class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,sum=0,min=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){sum+=nums[r];while(sum>=target){min=Math.min(min,r-l+1);sum-=nums[l++];}}
        return min==Integer.MAX_VALUE?0:min;
    }
}