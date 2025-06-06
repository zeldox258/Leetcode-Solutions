
import java.util.*;
class Solution {
    public boolean isReflected(int[][] points) {
        Set<String> set=new HashSet<>();
        int minX=Integer.MAX_VALUE, maxX=Integer.MIN_VALUE;
        for (int[] p:points){minX=Math.min(minX,p[0]);maxX=Math.max(maxX,p[0]);set.add(p[0]+","+p[1]);}
        double mid=(minX+maxX)/2.0;
        for (int[] p:points) if(!set.contains((int)(2*mid-p[0])+","+p[1])) return false;
        return true;
    }
}
