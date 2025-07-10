
import java.util.*;
class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0, res=0;
        for (int i=0;i<nums.length;i++) {
            sum+=nums[i];
            if (map.containsKey(sum-k)) res=Math.max(res,i-map.get(sum-k));
            map.putIfAbsent(sum,i);
        }
        return res;
    }
}
