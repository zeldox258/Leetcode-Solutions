
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for (int n:nums1) set.add(n);
        Set<Integer> res=new HashSet<>();
        for (int n:nums2) if(set.contains(n)) res.add(n);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
