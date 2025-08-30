class Solution {
public:
    int arrayOfDoubledPairs(int n) {
        int count=0;
        while(n){count+=n&1;n>>=1;}
        return count;
    }
};