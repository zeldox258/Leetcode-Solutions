class Solution {

    public final int[][] directions = {
        {-1,0},
        {0,1},
        {0,-1},
        {1,0}
    };
    public int minimumObstacles(int[][] grid) {
        int m = grid.length , n=grid[0].length;
        int[][] minObstacles = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(minObstacles[i],Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        minObstacles[0][0] = 0;

        pq.add(new int[] {0,0,0});

        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int obstacles = current[0],row = current[1], col = current[2];

            for(int[] dir:directions){
                int newRow = row + dir[0],newCol = col+dir[1];
                if(isValid(newRow,newCol,grid) && minObstacles[newRow][newCol] == Integer.MAX_VALUE){
                    if(grid[newRow][newCol] == 1){
                        minObstacles[newRow][newCol] = obstacles+1;
                    }
                    else{
                        minObstacles[newRow][newCol] = obstacles;
                    }
                    pq.add(new int[] {minObstacles[newRow][newCol],newRow,newCol});
                }
            }

        }

        return minObstacles[m-1][n-1];

    }

    boolean isValid(int row,int col,int[][] grid){
        if(row>=grid.length||row<0||col>=grid[0].length||col<0)
            return false;
        return true;
    }
}