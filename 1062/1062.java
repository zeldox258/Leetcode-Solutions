
class Solution {
    public int longestRepeatingSubstring(String s) {
        int lo=1,hi=s.length()-1,res=0;
        while(lo<=hi){int mid=(lo+hi)/2;if(check(s,mid)>0){res=mid;lo=mid+1;}else hi=mid-1;}
        return res;
    }
    int check(String s,int len){java.util.Set<Long>seen=new java.util.HashSet<>();long MOD=1_000_000_007L,base=31,h=0,pw=1;for(int i=0;i<len;i++){h=(h*base+s.charAt(i))%MOD;if(i<len-1)pw=pw*base%MOD;}seen.add(h);for(int i=len;i<s.length();i++){h=(h-s.charAt(i-len)*pw%MOD+MOD)%MOD;h=(h*base+s.charAt(i))%MOD;if(!seen.add(h))return 1;}return 0;}
}
