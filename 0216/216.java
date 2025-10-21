import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        bt(res,new ArrayList<>(),k,n,1);
        return res;
    }
    void bt(List<List<Integer>> res,List<Integer> cur,int k,int rem,int start){
        if(cur.size()==k&&rem==0){res.add(new ArrayList<>(cur));return;}
        for(int i=start;i<=9&&i<=rem;i++){cur.add(i);bt(res,cur,k,rem-i,i+1);cur.remove(cur.size()-1);}
    }
}