import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<nums.length;){
            int start=nums[i];
            while(i+1<nums.length&&nums[i+1]==nums[i]+1) i++;
            if(nums[i]==start) res.add(String.valueOf(start));
            else res.add(start+"->"+nums[i]);
            i++;
        }
        return res;
    }
}