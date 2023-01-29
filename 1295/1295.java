
class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int n:nums){ int d=String.valueOf(n).length(); if(d%2==0) cnt++; }
        return cnt;
    }
}
