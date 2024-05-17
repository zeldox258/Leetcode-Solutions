
class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return dfs(price, special, needs, new HashMap<>());
    }
    int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, Map<List<Integer>,Integer> memo) {
        if (memo.containsKey(needs)) return memo.get(needs);
        int n = needs.size(), cost = 0;
        for (int i = 0; i < n; i++) cost += needs.get(i) * price.get(i);
        for (List<Integer> offer : special) {
            List<Integer> next = new ArrayList<>(needs);
            boolean valid = true;
            for (int i = 0; i < n; i++) {
                next.set(i, needs.get(i) - offer.get(i));
                if (next.get(i) < 0) { valid = false; break; }
            }
            if (valid) cost = Math.min(cost, offer.get(n) + dfs(price, special, next, memo));
        }
        memo.put(needs, cost); return cost;
    }
}
