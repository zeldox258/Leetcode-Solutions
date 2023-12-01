
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String w : words) if (matches(w, pattern)) res.add(w);
        return res;
    }
    boolean matches(String w, String p) {
        Map<Character, Character> wp = new HashMap<>(), pw = new HashMap<>();
        for (int i = 0; i < w.length(); i++) {
            char a = w.charAt(i), b = p.charAt(i);
            if (wp.containsKey(a) && wp.get(a) != b) return false;
            if (pw.containsKey(b) && pw.get(b) != a) return false;
            wp.put(a, b); pw.put(b, a);
        }
        return true;
    }
}
