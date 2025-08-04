class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];int len=0;
        for(int n:nums){int lo=0,hi=len;while(lo<hi){int m=(lo+hi)/2;if(dp[m]<n)lo=m+1;else hi=m;}dp[lo]=n;if(lo==len)len++;}
        return len;
    }
}