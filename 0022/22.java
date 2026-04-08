import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }
    void backtrack(List<String> res, String cur, int open, int close, int n) {
        if (cur.length() == 2*n) { res.add(cur); return; }
        if (open < n) backtrack(res, cur+"(", open+1, close, n);
        if (close < open) backtrack(res, cur+")", open, close+1, n);
    }
}