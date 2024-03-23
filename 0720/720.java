
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> built = new HashSet<>(); built.add("");
        String res = "";
        for (String w : words) {
            if (built.contains(w.substring(0, w.length() - 1))) {
                built.add(w);
                if (w.length() > res.length()) res = w;
            }
        }
        return res;
    }
}
