
class Solution {
    Map<String, Boolean> memo = new HashMap<>();
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
        return dfs(maxChoosableInteger, desiredTotal, 0);
    }
    boolean dfs(int max, int total, int used) {
        if (total <= 0) return false;
        String key = total + "," + used;
        if (memo.containsKey(key)) return memo.get(key);
        for (int i = 1; i <= max; i++) {
            if ((used & (1 << i)) == 0) {
                if (!dfs(max, total - i, used | (1 << i))) {
                    memo.put(key, true); return true;
                }
            }
        }
        memo.put(key, false); return false;
    }
}
