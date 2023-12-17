class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int [] arr = new int[grid[0].length];
        for(int i=0; i<grid[0].length; i++){
            for(int j=0; j<grid.length; j++){
                arr[i] = Math.max(arr[i],String.valueOf(grid[j][i]).length());
            }
        }
        return arr;
    }
}