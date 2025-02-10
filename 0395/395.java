
class Solution {
    public int lengthOfLongestSubstringKRepeating(String s, int k) {
        int n=s.length(),res=0;
        for(int maxUniq=1;maxUniq<=26;maxUniq++){
            int[] cnt=new int[26]; int l=0,uniq=0,validUniq=0;
            for(int r=0;r<n;r++){
                int ri=s.charAt(r)-'a'; if(cnt[ri]==0)uniq++; cnt[ri]++; if(cnt[ri]==k)validUniq++;
                while(uniq>maxUniq){int li=s.charAt(l)-'a';if(cnt[li]==k)validUniq--;cnt[li]--;if(cnt[li]==0)uniq--;l++;}
                if(uniq==validUniq) res=Math.max(res,r-l+1);
            }
        }
        return res;
    }
}
