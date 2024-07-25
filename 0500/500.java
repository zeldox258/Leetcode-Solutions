
class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> res = new ArrayList<>();
        outer:
        for (String word : words) {
            for (String row : rows) {
                boolean ok = true;
                for (char c : word.toLowerCase().toCharArray())
                    if (row.indexOf(c) < 0) { ok = false; break; }
                if (ok) { res.add(word); continue outer; }
            }
        }
        return res.toArray(new String[0]);
    }
}
