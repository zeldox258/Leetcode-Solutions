class Solution {
    public boolean checkPowersOfThree(int n) {
        int tempN = n;
        while (tempN > 0) {
            if (tempN % 3 == 2) {
                return false;
            }else {
                tempN /= 3;
            }
        }
        return true;
    }

}