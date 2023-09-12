
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        java.util.Arrays.sort(points,(a,b)->a[0]*a[0]+a[1]*a[1]-b[0]*b[0]-b[1]*b[1]); return java.util.Arrays.copyOf(points,k);
    }
}
