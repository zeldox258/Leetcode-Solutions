import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) return res;
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        for (char c : digits.toCharArray()) {
            List<String> tmp = new ArrayList<>();
            for (String s : res)
                for (char ch : map[c-'0'].toCharArray())
                    tmp.add(s+ch);
            res = tmp;
        }
        return res;
    }
}