
class Solution {
    public int numTilePossibilities(String tiles) {
        int[]cnt=new int[26];for(char c:tiles.toCharArray())cnt[c-'a']++;return dfs(cnt);
    }
    int dfs(int[]cnt){int res=0;for(int i=0;i<26;i++)if(cnt[i]>0){res++;cnt[i]--;res+=dfs(cnt);cnt[i]++;}return res;}
}
