import java.util.*;
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(c=='+'||c=='-'||c=='*'){
                for(int l:diffWaysToCompute(expression.substring(0,i)))
                    for(int r:diffWaysToCompute(expression.substring(i+1))){
                        if(c=='+')res.add(l+r);else if(c=='-')res.add(l-r);else res.add(l*r);
                    }
            }
        }
        if(res.isEmpty()) res.add(Integer.parseInt(expression));
        return res;
    }
}