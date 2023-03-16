
class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long ab=lcm(a,b),bc=lcm(b,c),ac=lcm(a,c),abc=lcm(ab,c);
        long lo=1,hi=2*1000000000L;
        while(lo<hi){
            long mid=(lo+hi)/2;
            long cnt=mid/a+mid/b+mid/c-mid/ab-mid/bc-mid/ac+mid/abc;
            if(cnt<n) lo=mid+1; else hi=mid;
        }
        return (int)lo;
    }
    long gcd(long a,long b){return b==0?a:gcd(b,a%b);}
    long lcm(long a,long b){return a/gcd(a,b)*b;}
}
