import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();
        while(n!=1){if(!seen.add(n))return false;int s=0;while(n>0){int d=n%10;s+=d*d;n/=10;}n=s;}
        return true;
    }
}