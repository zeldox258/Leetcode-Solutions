
class Solution {
    public String smallestSubsequence(String s) {
        int[]cnt=new int[26];boolean[]inStack=new boolean[26];for(char c:s.toCharArray())cnt[c-'a']++;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){int ci=c-'a';cnt[ci]--;if(inStack[ci])continue;while(sb.length()>0&&sb.charAt(sb.length()-1)>c&&cnt[sb.charAt(sb.length()-1)-'a']>0){inStack[sb.charAt(sb.length()-1)-'a']=false;sb.deleteCharAt(sb.length()-1);}sb.append(c);inStack[ci]=true;}
        return sb.toString();
    }
}
