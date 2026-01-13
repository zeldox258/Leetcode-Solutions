import java.util.*;
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        bt(res,new ArrayList<>(),s,0);
        return res;
    }
    void bt(List<List<String>> res,List<String> cur,String s,int start){
        if(start==s.length()){res.add(new ArrayList<>(cur));return;}
        for(int end=start+1;end<=s.length();end++){
            String sub=s.substring(start,end);
            if(isPalin(sub)){cur.add(sub);bt(res,cur,s,end);cur.remove(cur.size()-1);}
        }
    }
    boolean isPalin(String s){int l=0,r=s.length()-1;while(l<r){if(s.charAt(l++)!=s.charAt(r--))return false;}return true;}
}