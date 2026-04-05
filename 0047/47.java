import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        bt(res,new ArrayList<>(),nums,new boolean[nums.length]);
        return res;
    }
    void bt(List<List<Integer>> res,List<Integer> cur,int[] nums,boolean[] used){
        if(cur.size()==nums.length){res.add(new ArrayList<>(cur));return;}
        for(int i=0;i<nums.length;i++){
            if(used[i]||(i>0&&nums[i]==nums[i-1]&&!used[i-1])) continue;
            used[i]=true;cur.add(nums[i]);bt(res,cur,nums,used);cur.remove(cur.size()-1);used[i]=false;
        }
    }
}