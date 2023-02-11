
class Solution {
    public int numWays(int steps, int arrLen) {
        int MOD=1000000007;
        arrLen=Math.min(arrLen,(steps/2)+1);
        int[] dp=new int[arrLen];
        dp[0]=1;
        for(int i=0;i<steps;i++){
            int[] ndp=new int[arrLen];
            for(int j=0;j<arrLen;j++){
                ndp[j]=(int)((ndp[j]+(long)dp[j])%MOD);
                if(j>0) ndp[j-1]=(int)((ndp[j-1]+(long)dp[j])%MOD);
                if(j<arrLen-1) ndp[j+1]=(int)((ndp[j+1]+(long)dp[j])%MOD);
            }
            dp=ndp;
        }
        return dp[0];
    }
}
