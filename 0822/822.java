
class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        Set<Integer> same = new HashSet<>();
        for (int i = 0; i < fronts.length; i++) if (fronts[i] == backs[i]) same.add(fronts[i]);
        int res = Integer.MAX_VALUE;
        for (int v : fronts) if (!same.contains(v)) res = Math.min(res, v);
        for (int v : backs) if (!same.contains(v)) res = Math.min(res, v);
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
