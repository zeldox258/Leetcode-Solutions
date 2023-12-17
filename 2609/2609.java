class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int zeroCount = 0;
        int oneCount = 0;
        int totalMax = Integer.MIN_VALUE;
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == '0') {
                zeroCount++;
                i++;
            }
            while (i < s.length() && s.charAt(i) == '1') {
                oneCount++;
                i++;
            }
            totalMax = Math.max(totalMax, 2 *  Math.min(zeroCount, oneCount));
            zeroCount = 0;
            oneCount = 0;
        }
        return totalMax;
    }
}