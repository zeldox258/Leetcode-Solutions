
class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length,res=2;
        java.util.Map<Integer,Integer>[]dp=(java.util.Map<Integer,Integer>[])new java.util.HashMap[n];
        for(int i=0;i<n;i++){dp[i]=new java.util.HashMap<>();for(int j=0;j<i;j++){int d=nums[i]-nums[j];dp[i].put(d,dp[j].getOrDefault(d,1)+1);res=Math.max(res,dp[i].get(d));}}
        return res;
    }
}
