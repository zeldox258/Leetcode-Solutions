
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] ch = s.toCharArray(); long sum = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            sum += shifts[i]; ch[i] = (char)('a' + (ch[i] - 'a' + sum) % 26);
        }
        return new String(ch);
    }
}
