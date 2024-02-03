
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0, n = s.length();
        while (i < n) {
            int j = i; while (j < n && s.charAt(j) == s.charAt(i)) j++;
            if (j - i >= 3) res.add(Arrays.asList(i, j - 1));
            i = j;
        }
        return res;
    }
}
