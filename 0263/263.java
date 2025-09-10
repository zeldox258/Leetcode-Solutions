class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        for(int f:new int[]{2,3,5}) while(n%f==0) n/=f;
        return n==1;
    }
}