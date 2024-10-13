
import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>(Collections.reverseOrder());
        for(int n:nums) set.add(n);
        if(set.size()<3){return Collections.max(set);}
        Iterator<Integer> it=set.iterator();it.next();it.next();return it.next();
    }
}
