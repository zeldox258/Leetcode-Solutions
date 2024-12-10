class Solution {
    public int maximumLength(String s) {
        int len = 0;
        int i = 0;
        while (i<s.length()) {
            int l = 0;
            int k = 0;
            StringBuilder str = new StringBuilder();
            str.append(s.charAt(i));
            for (int j = i + 1; j < s.length() - 2; j++) {
                if (str.charAt(0) == s.charAt(j)) {
                    str.append(s.charAt(j));
                } else {
                    break;
                }
            }
            i++;
            for (int j = 0; j <= s.length() - str.length(); j++) {
                String str1 = s.substring(j, j + str.length());
                if (str1.equals(str.toString())) {
                    l++;
                }
            }
            if (l >= 3) {
                k = str.length();
                if (k > len) {
                    len = k;
                }
            }

        }
        return len == 0 ? -1 : len;
    }
}