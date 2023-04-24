
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer,Integer> cnt=new HashMap<>();
        int res=0;
        for(int[] d:dominoes){
            int key=Math.min(d[0],d[1])*10+Math.max(d[0],d[1]);
            res+=cnt.getOrDefault(key,0);
            cnt.merge(key,1,Integer::sum);
        }
        return res;
    }
}
