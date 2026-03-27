import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res=new ArrayList<>();
        int[] cur=intervals[0];
        for(int[] iv:intervals){
            if(iv[0]<=cur[1]) cur[1]=Math.max(cur[1],iv[1]);
            else{res.add(cur);cur=iv;}
        }
        res.add(cur);
        return res.toArray(new int[0][]);
    }
}