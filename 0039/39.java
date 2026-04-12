import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        bt(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    void bt(List<List<Integer>> res,List<Integer> cur,int[] c,int rem,int start){
        if(rem==0){res.add(new ArrayList<>(cur));return;}
        for(int i=start;i<c.length&&c[i]<=rem;i++){cur.add(c[i]);bt(res,cur,c,rem-c[i],i);cur.remove(cur.size()-1);}
    }
}