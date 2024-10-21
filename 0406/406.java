
import java.util.*;
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->a[0]!=b[0]?b[0]-a[0]:a[1]-b[1]);
        List<int[]> list=new ArrayList<>();
        for(int[] p:people) list.add(p[1],p);
        return list.toArray(new int[list.size()][]);
    }
}
