
class Solution {
    public int longestWPI(int[] hours) {
        Map<Integer,Integer> seen=new HashMap<>();
        int score=0,res=0;
        for(int i=0;i<hours.length;i++){
            score+=hours[i]>8?1:-1;
            if(score>0) res=i+1;
            else{ seen.putIfAbsent(score,i); if(seen.containsKey(score-1)) res=Math.max(res,i-seen.get(score-1)); }
        }
        return res;
    }
}
