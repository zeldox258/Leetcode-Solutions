
class Solution {
    public int[] diStringMatch(String s) {
        int lo=0,hi=s.length(),n=s.length(); int[]res=new int[n+1];
        for(int i=0;i<n;i++) res[i]=s.charAt(i)=='I'?lo++:hi--; res[n]=lo; return res;
    }
}
