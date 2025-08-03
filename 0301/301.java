
import java.util.*;
class Solution {
    List<String> res = new ArrayList<>();
    public List<String> removeInvalidParentheses(String s) {
        int lrem = 0, rrem = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') lrem++;
            else if (c == ')') { if (lrem > 0) lrem--; else rrem++; }
        }
        dfs(s, 0, lrem, rrem);
        return res;
    }
    void dfs(String s, int start, int lrem, int rrem) {
        if (lrem == 0 && rrem == 0) { if (isValid(s)) res.add(s); return; }
        for (int i = start; i < s.length(); i++) {
            if (i != start && s.charAt(i) == s.charAt(i-1)) continue;
            char c = s.charAt(i);
            if (c == '(' && lrem > 0) dfs(s.substring(0,i)+s.substring(i+1), i, lrem-1, rrem);
            else if (c == ')' && rrem > 0) dfs(s.substring(0,i)+s.substring(i+1), i, lrem, rrem-1);
        }
    }
    boolean isValid(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') cnt++;
            else if (c == ')') { if (--cnt < 0) return false; }
        }
        return cnt == 0;
    }
}
