
import java.util.*;
class Solution {
    public NestedInteger deserialize(String s) {
        if(s.charAt(0)!='[') return new NestedInteger(Integer.parseInt(s));
        Deque<NestedInteger> stack=new ArrayDeque<>(); NestedInteger cur=null; int start=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='['){if(cur!=null)stack.push(cur);cur=new NestedInteger();start=i+1;}
            else if(c==']'){if(i>start){cur.add(new NestedInteger(Integer.parseInt(s.substring(start,i))));}if(!stack.isEmpty()){stack.peek().add(cur);cur=stack.pop();}start=i+1;}
            else if(c==','){if(i>start&&s.charAt(i-1)!=']'){cur.add(new NestedInteger(Integer.parseInt(s.substring(start,i))));}start=i+1;}
        }
        return cur;
    }
}
