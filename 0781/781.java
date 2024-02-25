
class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int res = 0;
        for (int a : answers) {
            cnt.put(a, cnt.getOrDefault(a, 0) + 1);
            if (cnt.get(a) == a + 1) { res += a + 1; cnt.put(a, 0); }
        }
        for (Map.Entry<Integer, Integer> e : cnt.entrySet()) if (e.getValue() > 0) res += e.getKey() + 1;
        return res;
    }
}
