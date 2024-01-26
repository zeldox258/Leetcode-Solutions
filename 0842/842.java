
class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> res = new ArrayList<>();
        backtrack(num, 0, res);
        return res;
    }
    boolean backtrack(String s, int idx, List<Integer> res) {
        if (idx == s.length() && res.size() >= 3) return true;
        for (int end = idx + 1; end <= s.length(); end++) {
            String sub = s.substring(idx, end);
            if (sub.length() > 1 && sub.charAt(0) == '0') break;
            long val = Long.parseLong(sub);
            if (val > Integer.MAX_VALUE) break;
            int sz = res.size();
            if (sz >= 2) {
                long sum = (long)res.get(sz-1) + res.get(sz-2);
                if (val < sum) continue; if (val > sum) break;
            }
            res.add((int)val);
            if (backtrack(s, end, res)) return true;
            res.remove(res.size() - 1);
        }
        return false;
    }
}
