
class Solution {
    public int characterReplacement(String s, int k) {
        int[] cnt=new int[26]; int l=0,maxCnt=0,res=0;
        for(int r=0;r<s.length();r++){
            maxCnt=Math.max(maxCnt,++cnt[s.charAt(r)-'A']);
            while(r-l+1-maxCnt>k) cnt[s.charAt(l++)-'A']--;
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
