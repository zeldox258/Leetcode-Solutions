
import java.util.*;
class Solution {
    String[] words; int res=Integer.MAX_VALUE;
    public String minAbbreviation(String target, String[] dictionary) {
        this.words=dictionary; int n=target.length();
        List<Integer> diffs=new ArrayList<>();
        for(String w:dictionary){if(w.length()!=n)continue;int d=0;for(int i=0;i<n;i++)if(w.charAt(i)!=target.charAt(i))d|=1<<i;diffs.add(d);}
        if(diffs.isEmpty()){return ""+n;}
        int full=(1<<n)-1; String best=target;
        for(int mask=0;mask<=full;mask++){String abbr=encode(target,mask);if(abbr.length()<best.length()&&valid(mask,diffs))best=abbr;}
        return best;
    }
    String encode(String t,int mask){StringBuilder sb=new StringBuilder();int cnt=0;for(int i=0;i<t.length();i++){if((mask>>i&1)==1){if(cnt>0){sb.append(cnt);cnt=0;}sb.append(t.charAt(i));}else cnt++;}if(cnt>0)sb.append(cnt);return sb.toString();}
    boolean valid(int mask,List<Integer> diffs){for(int d:diffs)if((mask&d)==0)return false;return true;}
}
