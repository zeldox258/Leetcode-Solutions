
class Solution {
    public boolean isBoomerang(int[][] points) {
        int[]a=points[0],b=points[1],c=points[2]; return (b[0]-a[0])*(c[1]-a[1])!=(b[1]-a[1])*(c[0]-a[0]);
    }
}
