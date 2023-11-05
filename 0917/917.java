
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray(); int l = 0, r = a.length - 1;
        while (l < r) {
            while (l < r && !Character.isLetter(a[l])) l++;
            while (l < r && !Character.isLetter(a[r])) r--;
            char t = a[l]; a[l++] = a[r]; a[r--] = t;
        }
        return new String(a);
    }
}
