
class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Long> dists = new HashSet<>();
        int[][] pts = {p1, p2, p3, p4};
        for (int i = 0; i < 4; i++) for (int j = i+1; j < 4; j++) {
            long d = dist(pts[i], pts[j]);
            if (d == 0) return false;
            dists.add(d);
        }
        return dists.size() == 2;
    }
    long dist(int[] a, int[] b) {
        return (long)(a[0]-b[0])*(a[0]-b[0]) + (long)(a[1]-b[1])*(a[1]-b[1]);
    }
}
