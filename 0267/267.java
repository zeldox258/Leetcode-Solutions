import java.util.*;
class Solution {
    public List<String> generatePalindromes(String s) {
        List<String> res=new ArrayList<>();
        int[] cnt=new int[128];for(char c:s.toCharArray())cnt[c]++;
        int oddCount=0;char oddChar=0;
        for(int i=0;i<128;i++){if(cnt[i]%2!=0){oddCount++;oddChar=(char)i;}cnt[i]/=2;}
        if(oddCount>1) return res;
        String mid=oddCount==1?String.valueOf(oddChar):"";
        bt(res,cnt,mid,s.length()/2,new char[s.length()/2],0);
        return res;
    }
    void bt(List<String> res,int[] cnt,String mid,int len,char[] cur,int idx){
        if(idx==len){String s=new String(cur);res.add(s+mid+new StringBuilder(s).reverse().toString());return;}
        for(int i=0;i<128;i++){if(cnt[i]>0){cnt[i]--;cur[idx]=((char)i);bt(res,cnt,mid,len,cur,idx+1);cnt[i]++;}}
    }
}