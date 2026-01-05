import java.util.*;
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict=new HashSet<>(wordDict);
        Map<Integer,List<String>> memo=new HashMap<>();
        return bt(s,0,dict,memo);
    }
    List<String> bt(String s,int start,Set<String> dict,Map<Integer,List<String>> memo){
        if(memo.containsKey(start)) return memo.get(start);
        List<String> res=new ArrayList<>();
        if(start==s.length()){res.add("");return res;}
        for(int end=start+1;end<=s.length();end++){
            String word=s.substring(start,end);
            if(dict.contains(word)){for(String rest:bt(s,end,dict,memo)){res.add(word+(rest.isEmpty()?"":" "+rest));}}
        }
        memo.put(start,res);return res;
    }
}