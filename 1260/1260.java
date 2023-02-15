
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length,total=m*n;
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++) for(int j=0;j<n;j++){
            int pos=(i*n+j+k)%total;
            res[pos/n][pos%n]=grid[i][j];
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int[] row:res){List<Integer> r=new ArrayList<>();for(int v:row)r.add(v);ans.add(r);}
        return ans;
    }
}
