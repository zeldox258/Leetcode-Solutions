class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    int rob(int[] nums,int l,int r){int prev2=0,prev1=0;for(int i=l;i<=r;i++){int cur=Math.max(prev1,prev2+nums[i]);prev2=prev1;prev1=cur;}return prev1;}
}