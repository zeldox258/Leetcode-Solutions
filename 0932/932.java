
class Solution {
    public int[] beautifulArray(int n) {
        java.util.List<Integer> res = new java.util.ArrayList<>(); res.add(1);
        while (res.size() < n) {
            java.util.List<Integer> tmp = new java.util.ArrayList<>();
            for (int v : res) if (2*v-1 <= n) tmp.add(2*v-1);
            for (int v : res) if (2*v <= n) tmp.add(2*v);
            res = tmp;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
