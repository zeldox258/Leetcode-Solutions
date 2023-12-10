
class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        for (char c : s.toCharArray()) size = Character.isDigit(c) ? size * (c - '0') : size + 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i); k %= size;
            if (k == 0 && Character.isLetter(c)) return String.valueOf(c);
            size = Character.isDigit(c) ? size / (c - '0') : size - 1;
        }
        return "";
    }
}
