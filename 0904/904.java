
class Solution {
    public int totalFruit(int[] fruits) {
        java.util.Map<Integer,Integer> map = new java.util.HashMap<>();
        int l = 0, res = 0;
        for (int r = 0; r < fruits.length; r++) {
            map.merge(fruits[r], 1, Integer::sum);
            while (map.size() > 2) {
                map.merge(fruits[l], -1, Integer::sum);
                if (map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
