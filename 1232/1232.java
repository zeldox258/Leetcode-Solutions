
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx=coordinates[1][0]-coordinates[0][0],dy=coordinates[1][1]-coordinates[0][1];
        for(int i=2;i<coordinates.length;i++){
            int x=coordinates[i][0]-coordinates[0][0],y=coordinates[i][1]-coordinates[0][1];
            if(dx*y!=dy*x) return false;
        }
        return true;
    }
}
