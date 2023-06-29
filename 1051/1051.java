
class Solution {
    public int heightChecker(int[] heights) {
        int[]sorted=heights.clone();java.util.Arrays.sort(sorted);int cnt=0;for(int i=0;i<heights.length;i++)if(heights[i]!=sorted[i])cnt++;return cnt;
    }
}
