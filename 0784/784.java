
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s.toCharArray(), 0, res);
        return res;
    }
    void backtrack(char[] s, int i, List<String> res) {
        if (i == s.length) { res.add(new String(s)); return; }
        backtrack(s, i + 1, res);
        if (Character.isLetter(s[i])) {
            s[i] ^= 32;
            backtrack(s, i + 1, res);
            s[i] ^= 32;
        }
    }
}
