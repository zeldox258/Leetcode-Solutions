class Solution {
    public boolean isSubstringPresent(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);
            String reverse = new StringBuilder(sub).reverse().toString();
            if (s.contains(reverse)) {
                return true;
            }
        }
        return false;
    }
}