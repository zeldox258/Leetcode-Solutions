class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int[] cnt = new int[24];
        for(int h : hours){
            cnt[h%24]++;
        }
        int ret=0;
        for(int i=1;i<12;i++){
            ret+= (cnt[i] * cnt[24-i]);
        }
        ret += calc(cnt[0]);
        ret += calc(cnt[12]);
        return ret;
    }
    public int calc(int n){
        if(n==0 || n==1){
            return 0;
        }
        return n*(n-1)/2;
    }
}