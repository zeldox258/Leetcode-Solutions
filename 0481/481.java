
class Solution {
    public int magicalString(int n) {
        int[] s = new int[Math.max(n, 3)];
        s[0] = 1; s[1] = 2; s[2] = 2;
        int head = 2, tail = 3, num = 1;
        while (tail < n) {
            for (int i = 0; i < s[head] && tail < n; i++) s[tail++] = num;
            num ^= 3; head++;
        }
        int count = 0;
        for (int i = 0; i < n; i++) if (s[i] == 1) count++;
        return count;
    }
}
