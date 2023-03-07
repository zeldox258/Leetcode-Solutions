
class Solution {
    public long countVowelPermutation(int n) {
        long MOD=1000000007;
        long a=1,e=1,i=1,o=1,u=1;
        for(int k=1;k<n;k++){
            long na=(e+i+u)%MOD,ne=(a+i)%MOD,ni=(e+o)%MOD,no=i,nu=(i+o)%MOD;
            a=na;e=ne;i=ni;o=no;u=nu;
        }
        return (a+e+i+o+u)%MOD;
    }
}
