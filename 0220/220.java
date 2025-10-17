import java.util.*;
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            Long floor=set.floor((long)nums[i]+valueDiff);
            if(floor!=null&&floor>=(long)nums[i]-valueDiff) return true;
            set.add((long)nums[i]);
            if(i>=indexDiff) set.remove((long)nums[i-indexDiff]);
        }
        return false;
    }
}