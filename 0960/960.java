
class Solution {
    public int minDeletionSize(String[] strs) {
        int n=strs.length,m=strs[0].length(); int[]dp=new int[m]; java.util.Arrays.fill(dp,1);
        for(int j=1;j<m;j++) for(int i=0;i<j;i++){ boolean ok=true; for(int k=0;k<n-1;k++) if(strs[k].charAt(j)<strs[k].charAt(i)){ok=false;break;} if(ok) dp[j]=Math.max(dp[j],dp[i]+1); }
        int best=0; for(int v:dp) best=Math.max(best,v); return m-best;
    }
}
