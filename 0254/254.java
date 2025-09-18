import java.util.*;
class Solution {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res=new ArrayList<>();
        bt(res,new ArrayList<>(),n,2);
        return res;
    }
    void bt(List<List<Integer>> res,List<Integer> cur,int n,int start){
        if(!cur.isEmpty()){List<Integer> tmp=new ArrayList<>(cur);tmp.add(n);res.add(tmp);}
        for(int i=start;(long)i*i<=n;i++){
            if(n%i==0){cur.add(i);bt(res,cur,n/i,i);cur.remove(cur.size()-1);}
        }
    }
}