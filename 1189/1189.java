
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] cnt=new int[26];
        for(char c:text.toCharArray()) cnt[c-'a']++;
        return Math.min(cnt[0],Math.min(cnt[1],Math.min(cnt[11]/2,Math.min(cnt[14]/2,cnt[13]))));
    }
}
