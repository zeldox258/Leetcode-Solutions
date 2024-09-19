
import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]); int cnt=0,end=Integer.MIN_VALUE;
        for(int[] iv:intervals){if(iv[0]>=end)end=iv[1];else cnt++;}
        return cnt;
    }
}
