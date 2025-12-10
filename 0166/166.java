import java.util.*;
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0) return "0";
        StringBuilder sb=new StringBuilder();
        if((numerator<0)^(denominator<0)) sb.append('-');
        long n=Math.abs((long)numerator),d=Math.abs((long)denominator);
        sb.append(n/d);n%=d;if(n==0) return sb.toString();
        sb.append('.');Map<Long,Integer> map=new HashMap<>();
        while(n!=0){
            if(map.containsKey(n)){sb.insert(map.get(n),'(');sb.append(')');break;}
            map.put(n,sb.length());n*=10;sb.append(n/d);n%=d;
        }
        return sb.toString();
    }
}