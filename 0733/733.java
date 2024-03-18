
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }
    void dfs(int[][] img, int i, int j, int orig, int color) {
        if (i < 0 || i >= img.length || j < 0 || j >= img[0].length || img[i][j] != orig) return;
        img[i][j] = color;
        dfs(img, i+1, j, orig, color); dfs(img, i-1, j, orig, color);
        dfs(img, i, j+1, orig, color); dfs(img, i, j-1, orig, color);
    }
}
