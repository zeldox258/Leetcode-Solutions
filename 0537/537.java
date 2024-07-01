
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int p1 = num1.indexOf('+', 1);
        int r1 = Integer.parseInt(num1.substring(0, p1));
        int i1 = Integer.parseInt(num1.substring(p1+1, num1.length()-1));
        int p2 = num2.indexOf('+', 1);
        int r2 = Integer.parseInt(num2.substring(0, p2));
        int i2 = Integer.parseInt(num2.substring(p2+1, num2.length()-1));
        return (r1*r2 - i1*i2) + "+" + (r1*i2 + r2*i1) + "i";
    }
}
