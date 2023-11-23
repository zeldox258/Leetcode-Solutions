
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>(), cur = new HashSet<>(), next;
        for (int a : arr) {
            next = new HashSet<>(); next.add(a);
            for (int c : cur) next.add(c | a);
            res.addAll(next); cur = next;
        }
        return res.size();
    }
}
