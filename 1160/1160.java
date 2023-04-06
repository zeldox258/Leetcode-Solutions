
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] cnt=new int[26];
        for(char c:chars.toCharArray()) cnt[c-'a']++;
        int res=0;
        for(String w:words){
            int[] wc=new int[26];
            for(char c:w.toCharArray()) wc[c-'a']++;
            boolean ok=true;
            for(int i=0;i<26;i++) if(wc[i]>cnt[i]){ok=false;break;}
            if(ok) res+=w.length();
        }
        return res;
    }
}
