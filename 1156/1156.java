
class Solution {
    public int maxRepOpt1(String text) {
        int[] cnt=new int[26];
        for(char c:text.toCharArray()) cnt[c-'a']++;
        int res=0,n=text.length();
        for(int i=0;i<n;){
            int j=i;
            while(j<n&&text.charAt(j)==text.charAt(i)) j++;
            int len=j-i;
            int k=j+1;
            while(k<n&&text.charAt(k)==text.charAt(i)) k++;
            int total=Math.min(len+(k-j-1)+(cnt[text.charAt(i)-'a']>len+(k-j-1)?1:0),cnt[text.charAt(i)-'a']);
            res=Math.max(res,total);
            i=j;
        }
        return res;
    }
}
