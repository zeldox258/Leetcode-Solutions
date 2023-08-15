
class Solution {
    public java.util.List<String> commonChars(String[] words) {
        int[]min=new int[26];java.util.Arrays.fill(min,Integer.MAX_VALUE);
        for(String w:words){int[]cnt=new int[26];for(char c:w.toCharArray())cnt[c-'a']++;for(int i=0;i<26;i++)min[i]=Math.min(min[i],cnt[i]);}
        java.util.List<String> res=new java.util.ArrayList<>(); for(int i=0;i<26;i++) for(int j=0;j<min[i];j++) res.add(String.valueOf((char)('a'+i))); return res;
    }
}
