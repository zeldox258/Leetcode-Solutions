
import java.util.*;
class Solution {
    public List<List<String>> wordSquares(String[] words) {
        Map<String,List<String>> map=new HashMap<>();
        for(String w:words) for(int i=0;i<w.length();i++) map.computeIfAbsent(w.substring(0,i),k->new ArrayList<>()).add(w);
        List<List<String>> res=new ArrayList<>();
        for(String w:words){List<String> sq=new ArrayList<>();sq.add(w);backtrack(sq,words[0].length(),map,res);}
        return res;
    }
    void backtrack(List<String> sq,int n,Map<String,List<String>> map,List<List<String>> res){
        if(sq.size()==n){res.add(new ArrayList<>(sq));return;}
        int idx=sq.size(); StringBuilder prefix=new StringBuilder();
        for(String s:sq) prefix.append(s.charAt(idx));
        for(String next:map.getOrDefault(prefix.toString(),new ArrayList<>())){sq.add(next);backtrack(sq,n,map,res);sq.remove(sq.size()-1);}
    }
}
