
class Solution {
    public int findIntegers(int n) {
        char[] bits = Integer.toBinaryString(n).toCharArray();
        int len = bits.length;
        int[] a = new int[len + 1];
        a[0] = 1; a[1] = 2;
        for (int i = 2; i <= len; i++) a[i] = a[i-1] + a[i-2];
        int res = 0, prev = 0;
        for (int i = 0; i < len; i++) {
            if (bits[i] == '1') {
                res += a[len - i - 1];
                if (prev == 1) { res--; break; }
            }
            prev = bits[i] - '0';
            if (i == len - 1) res++;
        }
        return res;
    }
}
