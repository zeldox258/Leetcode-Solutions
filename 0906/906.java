
class Solution {
    public int superpalindromesInRange(String left, String right) {
        long L=Long.parseLong(left),R=Long.parseLong(right); int MAGIC=100000,res=0;
        for(int k=1;k<MAGIC;k++){StringBuilder sb=new StringBuilder(Integer.toString(k));String half=sb.toString();String s=half+sb.reverse().substring(1);long v=Long.parseLong(s);v=v*v;if(v>R)break;if(v>=L&&isPalin(v))res++;}
        for(int k=1;k<MAGIC;k++){StringBuilder sb=new StringBuilder(Integer.toString(k));String half=sb.toString();String s=half+sb.reverse().toString();long v=Long.parseLong(s);v=v*v;if(v>R)break;if(v>=L&&isPalin(v))res++;}
        return res;
    }
    boolean isPalin(long x){String s=Long.toString(x);int l=0,r=s.length()-1;while(l<r)if(s.charAt(l++)!=s.charAt(r--))return false;return true;}
}
