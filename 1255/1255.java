
class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] cnt=new int[26];
        for(char c:letters) cnt[c-'a']++;
        int res=0;
        for(int mask=0;mask<(1<<words.length);mask++){
            int[] used=new int[26]; int sc=0; boolean ok=true;
            for(int i=0;i<words.length;i++){
                if((mask>>i&1)==1) for(char c:words[i].toCharArray()){used[c-'a']++;sc+=score[c-'a'];}
            }
            for(int i=0;i<26;i++) if(used[i]>cnt[i]){ok=false;break;}
            if(ok) res=Math.max(res,sc);
        }
        return res;
    }
}
