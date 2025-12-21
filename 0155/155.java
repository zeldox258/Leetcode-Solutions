import java.util.*;
class MinStack {
    Deque<Integer> stack=new ArrayDeque<>(),min=new ArrayDeque<>();
    public void push(int val){stack.push(val);if(min.isEmpty()||val<=min.peek())min.push(val);}
    public void pop(){if(stack.pop().equals(min.peek()))min.pop();}
    public int top(){return stack.peek();}
    public int getMin(){return min.peek();}
}