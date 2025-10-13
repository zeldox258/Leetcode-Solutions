import java.util.*;
class Solution {
    public int calculate(String s) {
        Deque<Integer> stack=new ArrayDeque<>();
        int res=0,num=0,sign=1;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) num=num*10+(c-'0');
            else if(c=='+'){res+=sign*num;num=0;sign=1;}
            else if(c=='-'){res+=sign*num;num=0;sign=-1;}
            else if(c=='('){stack.push(res);stack.push(sign);res=0;sign=1;}
            else if(c==')'){res+=sign*num;num=0;res*=stack.pop();res+=stack.pop();}
        }
        return res+sign*num;
    }
}