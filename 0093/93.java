import java.util.*;
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList<>();
        bt(res,s,0,new ArrayList<>());
        return res;
    }
    void bt(List<String> res,String s,int start,List<String> parts){
        if(parts.size()==4){if(start==s.length())res.add(String.join(".",parts));return;}
        for(int len=1;len<=3;len++){
            if(start+len>s.length()) break;
            String part=s.substring(start,start+len);
            if(part.length()>1&&part.charAt(0)=='0') break;
            if(Integer.parseInt(part)>255) break;
            parts.add(part);bt(res,s,start+len,parts);parts.remove(parts.size()-1);
        }
    }
}