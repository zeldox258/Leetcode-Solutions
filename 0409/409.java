
class Solution {
    public int longestPalindrome(String s) {
        int[] cnt=new int[128]; for(char c:s.toCharArray()) cnt[c]++;
        int res=0; boolean odd=false;
        for(int c:cnt){res+=c/2*2;if(c%2==1)odd=true;}
        return odd?res+1:res;
    }
}
