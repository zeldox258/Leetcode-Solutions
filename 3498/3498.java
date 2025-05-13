class Solution {
    public int reverseDegree(String s) {
        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            sum += (i + 1) * (97 + 26 - (int) s.charAt(i));
        }
        return sum;
    }
}