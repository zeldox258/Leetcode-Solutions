class Solution {

    public int helper(int ball1,int ball2){

        int rowsCount1 = (int)Math.sqrt(ball1);
        int rowsCount2=0;

        if(ball2<=1){
            rowsCount2 = 0;
        }else{
            rowsCount2 =  (-1 + (int)Math.sqrt(1+4*ball2))/2;
        }
        if(rowsCount2 >=rowsCount1){
            return 2*rowsCount1;
        }
        return 2*rowsCount2 +1;
    }
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(helper(red,blue),helper(blue,red));
    }
}