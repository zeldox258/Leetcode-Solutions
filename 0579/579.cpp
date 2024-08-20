class Solution {
public:
    int findCumulativeSalaryOfAnEmploy(int n) {
        int count=0;
        while(n){count+=n&1;n>>=1;}
        return count;
    }
};