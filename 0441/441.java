
class Solution {
    public int arrangeCoins(int n) {
        long l=0,r=n;
        while(l<=r){long m=l+(r-l)/2;if(m*(m+1)/2<=n)l=m+1;else r=m-1;}
        return (int)r;
    }
}
