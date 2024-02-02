
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int l = 0, r = row.length - 1;
            while (l <= r) { int tmp = row[l] ^ 1; row[l] = row[r] ^ 1; row[r] = tmp; l++; r--; }
        }
        return image;
    }
}
