import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        bt(res,new ArrayList<>(),nums,0);
        return res;
    }
    void bt(List<List<Integer>> res,List<Integer> cur,int[] nums,int start){
        res.add(new ArrayList<>(cur));
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i]==nums[i-1]) continue;
            cur.add(nums[i]);bt(res,cur,nums,i+1);cur.remove(cur.size()-1);
        }
    }
}