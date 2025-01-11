class Solution {
    public int distributeCandies(int n, int limit) {
        if(limit * 3 < n){
            return 0;
        }
        int ans = comb2(n + 2);
        if (n > limit) {
            ans -= 3 * comb2(n - limit + 1);
        }
        if (n - 2 >= 2 * limit) {
            ans += 3 * comb2(n - 2 * limit);
        }
        return ans;
    }
    private int comb2(int n) {
        return n * (n - 1) / 2;
    }
}