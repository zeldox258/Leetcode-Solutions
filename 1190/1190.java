
class Solution {
    public String reverseParentheses(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c==')'){
                List<Character> temp=new ArrayList<>();
                while(stack.peek()!='(') temp.add(stack.pop());
                stack.pop();
                for(char t:temp) stack.push(t);
            } else stack.push(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack) sb.append(c);
        return sb.reverse().toString();
    }
}
