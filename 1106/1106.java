
class Solution {
    int idx;
    public boolean parseBoolExpr(String expression) {
        idx=0; return parse(expression);
    }
    boolean parse(String s){
        char c=s.charAt(idx++);
        if(c=='t') return true;
        if(c=='f') return false;
        if(c=='!'){idx++;boolean r=parse(s);idx++;return !r;}
        boolean isAnd=(c=='&');
        idx++;
        boolean res=isAnd;
        while(s.charAt(idx)!=')'){
            boolean val=parse(s);
            if(isAnd) res&=val; else res|=val;
            if(s.charAt(idx)==',') idx++;
        }
        idx++;
        return res;
    }
}
