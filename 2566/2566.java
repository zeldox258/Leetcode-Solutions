class Solution {
    public int minMaxDifference(int num) {
        int result = 0;
        int biggerReplace = -1;
        boolean startWithNine = false;
        for (int divider = (int)10e8; divider >= 1; divider /= 10) {
            int digit = num / divider % 10;
            if (digit == 0 && biggerReplace == -1) {
                continue;
            }
            if (biggerReplace == -1 || biggerReplace == 9) {
                startWithNine = startWithNine ? true : digit == 9;
                biggerReplace = digit;
            }
            if (startWithNine) {
                if (digit == 9) {
                    result += 9 * divider;
                } else if (biggerReplace == digit) {
                    result += (9 - digit) * divider;
                }
            } else if (biggerReplace == digit) {
                result += 9 * divider;
            }
            
        }
        return result;
    }
}