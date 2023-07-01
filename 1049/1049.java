
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;for(int s:stones)sum+=s; boolean[]dp=new boolean[sum/2+1];dp[0]=true;
        for(int s:stones)for(int j=sum/2;j>=s;j--)dp[j]|=dp[j-s]; for(int j=sum/2;j>=0;j--)if(dp[j])return sum-2*j; return sum;
    }
}
