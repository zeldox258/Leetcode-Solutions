class Solution {
    public int minLength(String s) {
        int n = s.length();
        Stack<Character> stk = new Stack<>();
        stk.push('#');
        
        for (int i = 0; i < n; i++) {
            stk.push(s.charAt(i));
            
            if (stk.peek() == 'B') {
                stk.pop();
                if (!stk.isEmpty() && stk.peek() == 'A') {
                    stk.pop();
                } else {
                    stk.push('B');
                }
            } else if (stk.peek() == 'D') {
                stk.pop();
                if (!stk.isEmpty() && stk.peek() == 'C') {
                    stk.pop();
                } else {
                    stk.push('D');
                }
            }
        }
        
        return stk.size() - 1;
    }
}