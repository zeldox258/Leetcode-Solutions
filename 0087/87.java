import java.util.*;
class Solution {
    Map<String,Boolean> memo=new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2)) return true;
        String key=s1+","+s2;
        if(memo.containsKey(key)) return memo.get(key);
        int n=s1.length();int[] cnt=new int[26];
        for(int i=0;i<n;i++){cnt[s1.charAt(i)-'a']++;cnt[s2.charAt(i)-'a']--;}
        for(int c:cnt) if(c!=0){memo.put(key,false);return false;}
        for(int i=1;i<n;i++){
            if((isScramble(s1.substring(0,i),s2.substring(0,i))&&isScramble(s1.substring(i),s2.substring(i)))||
               (isScramble(s1.substring(0,i),s2.substring(n-i))&&isScramble(s1.substring(i),s2.substring(0,n-i)))){memo.put(key,true);return true;}
        }
        memo.put(key,false);return false;
    }
}