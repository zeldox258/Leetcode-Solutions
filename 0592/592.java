
class Solution {
    public String fractionAddition(String expression) {
        long num = 0, den = 1;
        int i = 0, n = expression.length();
        while (i < n) {
            int sign = 1;
            if (expression.charAt(i) == '+') { sign = 1; i++; }
            else if (expression.charAt(i) == '-') { sign = -1; i++; }
            long a = 0;
            while (i < n && Character.isDigit(expression.charAt(i))) a = a*10 + (expression.charAt(i++) - '0');
            i++; // skip '/'
            long b = 0;
            while (i < n && Character.isDigit(expression.charAt(i))) b = b*10 + (expression.charAt(i++) - '0');
            num = num * b + sign * a * den;
            den = den * b;
            long g = gcd(Math.abs(num), Math.abs(den));
            num /= g; den /= g;
        }
        return num + "/" + den;
    }
    long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }
}
