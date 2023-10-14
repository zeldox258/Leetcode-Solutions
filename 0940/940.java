
class Solution {
    public int distinctSubseqII(String s) {
        int MOD=1_000_000_007; int[]dp=new int[26];
        for(char c:s.toCharArray()){ int sum=1; for(int v:dp) sum=(sum+v)%MOD; dp[c-'a']=sum; }
        int res=0; for(int v:dp) res=(res+v)%MOD; return res;
    }
}
