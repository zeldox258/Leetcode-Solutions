class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] res = new int[points.length];
        for(int i =0;i<points.length;i++){
            res[i] = points[i][0];
        }
        Arrays.sort(res);
        int max = res[1]-res[0];
        for(int i = 2;i<res.length;i++){
            max = Math.max(max , res[i] - res[i-1]);
        }
        return max;
    }
}