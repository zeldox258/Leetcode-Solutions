
import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int n:nums){int idx=Math.abs(n)-1;if(nums[idx]<0)res.add(idx+1);else nums[idx]=-nums[idx];}
        return res;
    }
}
