class Solution {
    public int countServers(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[] rowCount = new int[rows]; // Count of servers in each row
        int[] colCount = new int[cols]; // Count of servers in each column
        int totalServers = 0;           // Total number of servers

        // First pass: Count servers in each row and column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                    totalServers++; // Count all servers
                }
            }
        }

        // Second pass: Count servers that can communicate
        int communicableServers = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && (rowCount[i] > 1 || colCount[j] > 1)) {
                    communicableServers++;
                }
            }
        }

        return communicableServers;
    }
}