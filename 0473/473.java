
class Solution {
    public boolean makesquare(int[] matchsticks) {
        if (matchsticks == null || matchsticks.length < 4) return false;
        int sum = 0;
        for (int m : matchsticks) sum += m;
        if (sum % 4 != 0) return false;
        Arrays.sort(matchsticks);
        int[] sides = new int[4];
        return dfs(matchsticks, sides, matchsticks.length - 1, sum / 4);
    }
    boolean dfs(int[] m, int[] sides, int idx, int target) {
        if (idx < 0) return sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == target;
        Set<Integer> tried = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            if (tried.contains(sides[i])) continue;
            if (sides[i] + m[idx] <= target) {
                tried.add(sides[i]);
                sides[i] += m[idx];
                if (dfs(m, sides, idx - 1, target)) return true;
                sides[i] -= m[idx];
            }
        }
        return false;
    }
}
