
class Solution {
    public int findLUSlength(String[] strs) {
        int res = -1;
        for (int i = 0; i < strs.length; i++) {
            boolean uncommon = true;
            for (int j = 0; j < strs.length; j++) {
                if (i != j && isSubseq(strs[i], strs[j])) { uncommon = false; break; }
            }
            if (uncommon) res = Math.max(res, strs[i].length());
        }
        return res;
    }
    boolean isSubseq(String a, String b) {
        int i = 0;
        for (char c : b.toCharArray()) if (i < a.length() && c == a.charAt(i)) i++;
        return i == a.length();
    }
}
