
class Solution {
    public int minTransfers(int[][] transactions) {
        Map<Integer, Long> bal = new HashMap<>();
        for (int[] t : transactions) {
            bal.merge(t[0], (long)-t[2], Long::sum);
            bal.merge(t[1], (long)t[2], Long::sum);
        }
        List<Long> debts = new ArrayList<>();
        for (long v : bal.values()) if (v != 0) debts.add(v);
        return dfs(debts, 0);
    }
    int dfs(List<Long> debts, int s) {
        while (s < debts.size() && debts.get(s) == 0) s++;
        if (s == debts.size()) return 0;
        int res = Integer.MAX_VALUE;
        for (int i = s + 1; i < debts.size(); i++) {
            if (debts.get(i) * debts.get(s) < 0) {
                debts.set(i, debts.get(i) + debts.get(s));
                res = Math.min(res, 1 + dfs(debts, s + 1));
                debts.set(i, debts.get(i) - debts.get(s));
            }
        }
        return res;
    }
}
