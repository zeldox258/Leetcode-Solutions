class Solution {
    public int solve3325(int n) {
        int count=0;
        while(n!=0){count+=n&1;n>>>=1;}
        return count;
    }
}