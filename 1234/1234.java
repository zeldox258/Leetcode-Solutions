
class Solution {
    public int balancedString(String s) {
        int n=s.length(),k=n/4;
        int[] cnt=new int[26];
        for(char c:s.toCharArray()) cnt[c-'A']++;
        if(cnt['Q'-'A']==k&&cnt['W'-'A']==k&&cnt['E'-'A']==k&&cnt['R'-'A']==k) return 0;
        int res=n,l=0;
        for(int r=0;r<n;r++){
            cnt[s.charAt(r)-'A']--;
            while(l<=r&&cnt['Q'-'A']<=k&&cnt['W'-'A']<=k&&cnt['E'-'A']<=k&&cnt['R'-'A']<=k){
                res=Math.min(res,r-l+1);
                cnt[s.charAt(l++)-'A']++;
            }
        }
        return res;
    }
}
