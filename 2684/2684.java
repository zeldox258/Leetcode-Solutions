class Solution {
    public int maxMoves(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < m; i++)
            q.add(i);
        int moves = 0;
        while(!q.isEmpty()) {
            int j = moves;
            boolean[] canVis = new boolean[m];
            while(!q.isEmpty()) {
                int i = q.poll();
                if(i-1 >= 0 && j+1 < n && mat[i-1][j+1] > mat[i][j])
                    canVis[i-1] = true;

                if(j+1 < n && mat[i][j+1] > mat[i][j])
                    canVis[i] = true;

                if(i+1 < m && j+1 < n && mat[i+1][j+1] > mat[i][j])
                    canVis[i+1] = true;
            }
            for(int i = 0; i < m; i++) {
                if(canVis[i])
                    q.add(i);
            }
            if(!q.isEmpty()) moves++;
        }
        return moves;
    }
}