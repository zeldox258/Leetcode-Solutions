class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=sumSq(n);
        while(fast!=1&&slow!=fast){slow=sumSq(slow);fast=sumSq(sumSq(fast));}
        return fast==1;
    }
    int sumSq(int n){int s=0;while(n>0){int d=n%10;s+=d*d;n/=10;}return s;}
}