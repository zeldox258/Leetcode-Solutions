import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String t:tokens){
            if(t.equals("+"))stack.push(stack.pop()+stack.pop());
            else if(t.equals("-")){int b=stack.pop(),a=stack.pop();stack.push(a-b);}
            else if(t.equals("*"))stack.push(stack.pop()*stack.pop());
            else if(t.equals("/")){int b=stack.pop(),a=stack.pop();stack.push(a/b);}
            else stack.push(Integer.parseInt(t));
        }
        return stack.pop();
    }
}