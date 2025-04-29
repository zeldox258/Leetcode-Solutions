public class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int one = (coordinate1.charAt(0) - 'a') + (coordinate1.charAt(1) - '0');
        int two = (coordinate2.charAt(0) - 'a') + (coordinate2.charAt(1) - '0');
        return one % 2 == two % 2;
    }
}