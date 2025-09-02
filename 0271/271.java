import java.util.*;
class Codec {
    public String encode(List<String> strs){
        StringBuilder sb=new StringBuilder();
        for(String s:strs)sb.append(s.length()).append('#').append(s);
        return sb.toString();
    }
    public List<String> decode(String s){
        List<String> res=new ArrayList<>();int i=0;
        while(i<s.length()){int j=s.indexOf('#',i);int len=Integer.parseInt(s.substring(i,j));res.add(s.substring(j+1,j+1+len));i=j+1+len;}
        return res;
    }
}