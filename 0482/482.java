
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) != '-') sb.append(Character.toUpperCase(s.charAt(i)));
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (i > 0 && i % k == 0) res.append('-');
            res.append(sb.charAt(i));
        }
        return res.reverse().toString();
    }
}
