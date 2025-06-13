
import java.util.*;
class SummaryRanges {
    TreeMap<Integer,Integer> map=new TreeMap<>();
    public void addNum(int value) {
        if (map.containsKey(value)) return;
        int lo=value, hi=value;
        Map.Entry<Integer,Integer> lower=map.lowerEntry(value), higher=map.higherEntry(value);
        if (lower!=null&&lower.getValue()>=value-1) { lo=lower.getKey(); map.remove(lo); }
        if (higher!=null&&higher.getKey()<=value+1) { hi=higher.getValue(); map.remove(higher.getKey()); }
        map.put(lo,hi);
    }
    public int[][] getIntervals() {
        int[][] res=new int[map.size()][2]; int i=0;
        for (Map.Entry<Integer,Integer> e:map.entrySet()) res[i++]=new int[]{e.getKey(),e.getValue()};
        return res;
    }
}
