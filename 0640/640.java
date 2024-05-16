
class Solution {
    public String solveEquation(String equation) {
        String[] sides = equation.split("=");
        int[] left = parse(sides[0]), right = parse(sides[1]);
        int coef = left[0] - right[0], val = right[1] - left[1];
        if (coef == 0) return val == 0 ? "Infinite solutions" : "No solution";
        return "x=" + (val / coef);
    }
    int[] parse(String s) {
        int coef = 0, val = 0, sign = 1, i = 0, n = s.length();
        while (i < n) {
            if (s.charAt(i) == '+') { sign = 1; i++; }
            else if (s.charAt(i) == '-') { sign = -1; i++; }
            int j = i;
            while (j < n && s.charAt(j) != '+' && s.charAt(j) != '-') j++;
            String token = s.substring(i, j);
            if (token.endsWith("x")) {
                String num = token.substring(0, token.length()-1);
                coef += sign * (num.isEmpty() || num.equals("-") ? (num.isEmpty() ? 1 : -1) : Integer.parseInt(num));
            } else if (!token.isEmpty()) val += sign * Integer.parseInt(token);
            i = j;
        }
        return new int[]{coef, val};
    }
}
