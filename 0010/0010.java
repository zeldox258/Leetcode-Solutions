class Solution {
    public boolean isMatch(String s, String p) {
        int is = s.length() - 1;
        int ip = p.length() - 1;
        return helper (s, p, is, ip);
    }

    public boolean helper(String s, String p, int is, int ip) {
        while (is >= -1 && ip >= 0) { // is >= -1 since left to examine in p may be like "a*" and * may mean 0.
            if (p.charAt(ip) != '*') {
                if (is == -1 || p.charAt(ip) != '.' && p.charAt(ip) != s.charAt(is))
                    return false;
                is--;
                ip--;
            }
            else {
                if (helper(s, p, is, ip - 2))
                    return true;
                if (is == -1 || p.charAt(ip - 1) != '.' && s.charAt(is) != p.charAt(ip - 1))
                    return false;

                return helper(s, p, is - 1, ip);
            }
        }

        if (is == -1 && ip == -1)
            return true;
        return false;
    }
}