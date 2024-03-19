
class Solution {
    public List<Integer> selfDividingNumbers(int low, int high) {
        List<Integer> res = new ArrayList<>();
        for (int n = low; n <= high; n++) if (isSelf(n)) res.add(n);
        return res;
    }
    boolean isSelf(int n) {
        int tmp = n;
        while (tmp > 0) { int d = tmp % 10; if (d == 0 || n % d != 0) return false; tmp /= 10; }
        return true;
    }
}
