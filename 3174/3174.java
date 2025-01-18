class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (stack.length() > 0) {
                    stack.delete(stack.length() - 1, stack.length());
                }
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}