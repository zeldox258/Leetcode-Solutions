import java.util.*;
class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res=new ArrayList<>();
        long prev=(long)lower-1;
        for(int i=0;i<=nums.length;i++){
            long cur=i==nums.length?(long)upper+1:nums[i];
            if(cur-prev==2) res.add(String.valueOf(prev+1));
            else if(cur-prev>2) res.add((prev+1)+"->"+(cur-1));
            prev=cur;
        }
        return res;
    }
}