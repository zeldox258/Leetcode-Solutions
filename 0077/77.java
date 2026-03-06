import java.util.*;
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        bt(res,new ArrayList<>(),1,n,k);
        return res;
    }
    void bt(List<List<Integer>> res,List<Integer> cur,int start,int n,int k){
        if(cur.size()==k){res.add(new ArrayList<>(cur));return;}
        for(int i=start;i<=n-(k-cur.size())+1;i++){cur.add(i);bt(res,cur,i+1,n,k);cur.remove(cur.size()-1);}
    }
}