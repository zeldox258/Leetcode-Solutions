
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for (String word : dictionary) {
            if (isSubseq(word, s)) {
                if (word.length() > res.length() || (word.length() == res.length() && word.compareTo(res) < 0))
                    res = word;
            }
        }
        return res;
    }
    boolean isSubseq(String word, String s) {
        int i = 0;
        for (char c : s.toCharArray()) if (i < word.length() && c == word.charAt(i)) i++;
        return i == word.length();
    }
}
