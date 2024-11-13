class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder result = new StringBuilder();
        for (int i = 4; i >= 0; i--) {
            result.append(Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10)));
            num1 = num1 / 10;
            num2 = num2 / 10;
            num3 = num3 / 10;
        }
        return Integer.parseInt(result.reverse().toString());
    }
}