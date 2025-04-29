class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = s.charAt(i) - '0';
        }
        
        while (n > 2) {
            for (int i = 0; i < n - 1; i++) {
                digits[i] = (digits[i] + digits[i + 1]) % 10;
            }
            n--;
        }
        return digits[0] == digits[1];
    }
}