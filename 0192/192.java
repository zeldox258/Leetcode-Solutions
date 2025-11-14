class Solution {
    public int rob(int[] nums) {
        int prev2=0,prev1=0;
        for(int n:nums){int cur=Math.max(prev1,prev2+n);prev2=prev1;prev1=cur;}
        return prev1;
    }
}