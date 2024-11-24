class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int negatives = 0;
        int smallest = Integer.MAX_VALUE;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 0) negatives++;
                int abs = Math.abs(num);
                smallest = Math.min(smallest, abs);
                sum += abs;
            }
        }
        return (negatives % 2 != 0) ? sum - (2L * smallest) : sum;
    }
}