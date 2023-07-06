
class Solution {
    public String longestDupSubstring(String s) {
        int n=s.length(),lo=1,hi=n-1; String res="";
        while(lo<=hi){int mid=(lo+hi)/2;String dup=check(s,mid);if(dup!=null){res=dup;lo=mid+1;}else hi=mid-1;}
        return res;
    }
    String check(String s,int len){long MOD=1_000_000_007L,base=31,h=0,pw=1;for(int i=0;i<len;i++){h=(h*base+s.charAt(i))%MOD;if(i<len-1)pw=pw*base%MOD;}java.util.Map<Long,java.util.List<Integer>>map=new java.util.HashMap<>();map.computeIfAbsent(h,k->new java.util.ArrayList<>()).add(0);for(int i=len;i<s.length();i++){h=(h-s.charAt(i-len)*pw%MOD+MOD)%MOD;h=(h*base+s.charAt(i))%MOD;for(int start:map.getOrDefault(h,new java.util.ArrayList<>()))if(s.substring(start,start+len).equals(s.substring(i-len+1,i+1)))return s.substring(start,start+len);map.computeIfAbsent(h,k->new java.util.ArrayList<>()).add(i-len+1);}return null;}
}
