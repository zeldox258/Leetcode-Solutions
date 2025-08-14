import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");if(pattern.length()!=words.length) return false;
        Map<Character,String> pc=new HashMap<>();Map<String,Character> wc=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char p=pattern.charAt(i);String w=words[i];
            if(pc.containsKey(p)&&!pc.get(p).equals(w)) return false;
            if(wc.containsKey(w)&&wc.get(w)!=p) return false;
            pc.put(p,w);wc.put(w,p);
        }
        return true;
    }
}