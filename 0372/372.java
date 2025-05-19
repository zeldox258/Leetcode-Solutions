
class Solution {
    public int superPow(int a, int[] b) {
        int mod=1337,res=1; a%=mod;
        for(int i=b.length-1;i>=0;i--){res=res*pow(a,b[i],mod)%mod;a=pow(a,10,mod);}
        return res;
    }
    int pow(int a,int n,int mod){int res=1;for(int i=0;i<n;i++)res=res*a%mod;return res;}
}
