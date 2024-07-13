
class Solution {
    public boolean detectCapitalUse(String word) {
        int upCnt = 0;
        for (char c : word.toCharArray()) if (Character.isUpperCase(c)) upCnt++;
        return upCnt == 0 || upCnt == word.length() ||
               (upCnt == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
