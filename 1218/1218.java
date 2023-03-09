
class Solution {
    public int longestArithSeqLength(int[] arr, int difference) {
        Map<Integer,Integer> dp=new HashMap<>();
        int res=1;
        for(int a:arr){
            int val=dp.getOrDefault(a-difference,0)+1;
            dp.put(a,Math.max(dp.getOrDefault(a,0),val));
            res=Math.max(res,dp.get(a));
        }
        return res;
    }
}
