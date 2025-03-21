class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        // Step 1: Create a 2D array to count colors picked by each player
        int[][] colorCounts = new int[n][11];

        // Step 2: Update the color counts based on the picks
        for (int[] p : pick) {
            int player = p[0], color = p[1];
            colorCounts[player][color]++;
        }

        // Step 3: Count the number of winning players
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int val : colorCounts[i]) {
                if (val > i) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}