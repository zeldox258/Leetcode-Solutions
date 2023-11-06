
class Solution {
    public java.util.List<String> wordSubsets(String[] words1, String[] words2) {
        int[]bmax=new int[26];
        for(String w:words2){int[]cnt=new int[26];for(char c:w.toCharArray())cnt[c-'a']++;for(int i=0;i<26;i++)bmax[i]=Math.max(bmax[i],cnt[i]);}
        java.util.List<String> res=new java.util.ArrayList<>();
        outer:for(String w:words1){int[]cnt=new int[26];for(char c:w.toCharArray())cnt[c-'a']++;for(int i=0;i<26;i++)if(cnt[i]<bmax[i])continue outer;res.add(w);}
        return res;
    }
}
