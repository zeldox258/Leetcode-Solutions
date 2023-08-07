
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[]cnt=new int[60];int res=0; for(int t:time){res+=cnt[(600-t%60)%60];cnt[t%60]++;} return res;
    }
}
