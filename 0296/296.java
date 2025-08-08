class Solution {
    public int minTotalDistance(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        java.util.List<Integer> rows=new java.util.ArrayList<>(),cols=new java.util.ArrayList<>();
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) if(grid[i][j]==1){rows.add(i);cols.add(j);}
        java.util.Collections.sort(cols);
        int medR=rows.get(rows.size()/2),medC=cols.get(cols.size()/2),dist=0;
        for(int r:rows) dist+=Math.abs(r-medR);for(int c:cols) dist+=Math.abs(c-medC);return dist;
    }
}