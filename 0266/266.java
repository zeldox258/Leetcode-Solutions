class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] cnt=new int[128];for(char c:s.toCharArray()) cnt[c]++;int odd=0;for(int x:cnt) if(x%2!=0)odd++;return odd<=1;
    }
}