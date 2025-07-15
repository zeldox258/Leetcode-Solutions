
import java.util.*;
class Solution {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();
        backtrack(word, 0, "", 0, res);
        return res;
    }
    void backtrack(String word, int pos, String cur, int count, List<String> res) {
        if (pos == word.length()) {
            res.add(cur + (count>0?count:""));
            return;
        }
        backtrack(word, pos+1, cur, count+1, res);
        backtrack(word, pos+1, cur+(count>0?count:"")+word.charAt(pos), 0, res);
    }
}
