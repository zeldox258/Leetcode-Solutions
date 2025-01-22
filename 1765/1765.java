class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] height = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Initialize the queue with water cells and set their height to 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    height[i][j] = 0; // Water cell height is 0
                    queue.offer(new int[]{i, j}); // Add water cell to the queue
                } else {
                    height[i][j] = -1; // Land cell is initially unvisited
                }
            }
        }

        // Directions for adjacent cells (up, down, left, right)
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // BFS to propagate heights
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                // Check bounds and if the cell is a land cell and unvisited
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && height[newX][newY] == -1) {
                    height[newX][newY] = height[x][y] + 1; // Set height
                    queue.offer(new int[]{newX, newY}); // Add to queue for further processing
                }
            }
        }

        return height; // Return the height matrix
    }
}