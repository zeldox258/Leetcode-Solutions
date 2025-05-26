
import java.util.*;
class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(x+y<target) return false;
        Set<Long> visited=new HashSet<>();
        Deque<Long> q=new ArrayDeque<>();
        q.offer(0L); visited.add(0L);
        while(!q.isEmpty()){
            long cur=q.poll();
            if(cur==target) return true;
            long[] next={0,x,y,cur+x,cur+y,cur-x,cur-y,(cur>y?cur-y:0),(cur>x?cur-x:0)};
            for(long n:next){n=Math.min(Math.max(n,0),x+y);if(n<=x+y&&visited.add(n))q.offer(n);}
        }
        return false;
    }
}
