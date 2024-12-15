class Solution {
    public int solve3227(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target) return m;
            if(nums[m]<target) l=m+1; else r=m-1;
        }
        return -1;
    }
}