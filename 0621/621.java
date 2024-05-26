
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] cnt = new int[26];
        for (char c : tasks) cnt[c-'A']++;
        Arrays.sort(cnt);
        int maxCnt = cnt[25], maxNum = 0;
        for (int c : cnt) if (c == maxCnt) maxNum++;
        return Math.max(tasks.length, (maxCnt-1)*(n+1) + maxNum);
    }
}
