class Solution {
    public int maxProduct(int n){
        int m1 = 0,m2=0;
        while(n>0){
            int m = n%10;
            if(m>m1){
                m2 = m1;
                m1 = m;
            }
            else if(m>m2){
                m2 = m;
            }
            n/=10;
        }
        return m1*m2;
    }
}