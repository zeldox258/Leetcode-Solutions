
class Solution {
    public int knightDialer(int n) {
        int MOD=1_000_000_007; int[][]moves={{4,6},{6,8},{7,9},{4,8},{0,3,9},{},{0,1,7},{2,6},{1,3},{2,4}};
        long[]dp=new long[10]; java.util.Arrays.fill(dp,1);
        for(int i=1;i<n;i++){ long[]ndp=new long[10]; for(int d=0;d<10;d++) for(int nd:moves[d]) ndp[nd]=(ndp[nd]+dp[d])%MOD; dp=ndp; }
        long res=0; for(long v:dp) res=(res+v)%MOD; return (int)res;
    }
}
