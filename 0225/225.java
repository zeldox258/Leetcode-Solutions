import java.util.*;
class MyStack {
    private Queue<Integer> q=new LinkedList<>();
    public void push(int x){q.offer(x);for(int i=1;i<q.size();i++) q.offer(q.poll());}
    public int pop(){return q.poll();}
    public int top(){return q.peek();}
    public boolean empty(){return q.isEmpty();}
}