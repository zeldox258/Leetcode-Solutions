import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack=new ArrayDeque<>();
        for(String p:path.split("/")){
            if(p.equals("..")){if(!stack.isEmpty())stack.pop();}
            else if(!p.isEmpty()&&!p.equals(".")) stack.push(p);
        }
        StringBuilder sb=new StringBuilder();
        for(String s:stack) sb.insert(0,"/"+s);
        return sb.length()==0?"/":sb.toString();
    }
}