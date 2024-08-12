
class Solution {
    public int findComplement(int num) {
        int mask = 1;
        while (mask <= num) mask <<= 1;
        return (mask - 1) ^ num;
    }
}
