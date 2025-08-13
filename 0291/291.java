import java.util.*;
class Solution {
    public boolean wordPatternMatch(String pattern, String s) {
        return bt(pattern,s,0,0,new HashMap<>(),new HashSet<>());
    }
    boolean bt(String pat,String s,int pi,int si,Map<Character,String> map,Set<String> used){
        if(pi==pat.length()&&si==s.length()) return true;
        if(pi==pat.length()||si==s.length()) return false;
        char p=pat.charAt(pi);
        if(map.containsKey(p)){String w=map.get(p);return s.startsWith(w,si)&&bt(pat,s,pi+1,si+w.length(),map,used);}
        for(int len=1;si+len<=s.length();len++){
            String w=s.substring(si,si+len);
            if(used.contains(w)) continue;
            map.put(p,w);used.add(w);
            if(bt(pat,s,pi+1,si+len,map,used)) return true;
            map.remove(p);used.remove(w);
        }
        return false;
    }
}