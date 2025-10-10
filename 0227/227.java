import java.util.*;
class Solution {
    public int calculate(String s) {
        Deque<Integer> stack=new ArrayDeque<>();
        int num=0;char sign='+';
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)) num=num*10+(c-'0');
            if((!Character.isDigit(c)&&c!=' ')||i==s.length()-1){
                if(sign=='+') stack.push(num);
                else if(sign=='-') stack.push(-num);
                else if(sign=='*') stack.push(stack.pop()*num);
                else stack.push(stack.pop()/num);
                sign=c;num=0;
            }
        }
        int res=0;for(int x:stack) res+=x;return res;
    }
}