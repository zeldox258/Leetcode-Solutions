import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] ms=new int[256],mt=new int[256];
        for(int i=0;i<s.length();i++){
            if(ms[s.charAt(i)]!=mt[t.charAt(i)]) return false;
            ms[s.charAt(i)]=mt[t.charAt(i)]=i+1;
        }
        return true;
    }
}