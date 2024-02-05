
class Solution {
    public int numFriendRequests(int[] ages) {
        int[] cnt = new int[121];
        for (int a : ages) cnt[a]++;
        int res = 0;
        for (int a = 1; a <= 120; a++) for (int b = 1; b <= 120; b++) {
            if (b <= 0.5 * a + 7 || b > a || (b > 100 && a < 100)) continue;
            res += cnt[a] * (cnt[b] - (a == b ? 1 : 0));
        }
        return res;
    }
}
