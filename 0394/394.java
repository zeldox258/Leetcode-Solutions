
import java.util.*;
class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack=new ArrayDeque<>(); Deque<String> strStack=new ArrayDeque<>();
        String cur=""; int k=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) k=k*10+(c-'0');
            else if(c=='['){countStack.push(k);strStack.push(cur);k=0;cur="";}
            else if(c==']'){int n=countStack.pop();String prev=strStack.pop();StringBuilder sb=new StringBuilder(prev);for(int i=0;i<n;i++)sb.append(cur);cur=sb.toString();}
            else cur+=c;
        }
        return cur;
    }
}
