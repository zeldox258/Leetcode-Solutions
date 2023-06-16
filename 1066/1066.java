
class Solution {
    public int assignWork(int[] workers, int[] bikes) {
        int n=workers.length; int[][]cost=new int[n][bikes.length];
        for(int i=0;i<n;i++) for(int j=0;j<bikes.length;j++) cost[i][j]=Math.abs(workers[i]-bikes[j]);
        int[]dp=new int[1<<bikes.length]; java.util.Arrays.fill(dp,Integer.MAX_VALUE); dp[0]=0;
        for(int mask=0;mask<(1<<bikes.length);mask++){if(dp[mask]==Integer.MAX_VALUE)continue;int wi=Integer.bitCount(mask);if(wi>=n)continue;for(int j=0;j<bikes.length;j++)if((mask&(1<<j))==0)dp[mask|(1<<j)]=Math.min(dp[mask|(1<<j)],dp[mask]+cost[wi][j]);}
        int res=Integer.MAX_VALUE; for(int mask=0;mask<(1<<bikes.length);mask++) if(Integer.bitCount(mask)==n) res=Math.min(res,dp[mask]); return res;
    }
}
