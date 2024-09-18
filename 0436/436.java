
import java.util.*;
class Solution {
    public int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<intervals.length;i++) map.put(intervals[i][0],i);
        int[] res=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){Map.Entry<Integer,Integer> e=map.ceilingEntry(intervals[i][1]);res[i]=e==null?-1:e.getValue();}
        return res;
    }
}
