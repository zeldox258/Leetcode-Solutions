class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        double max = 0;
        for(int[] i : dimensions){
            int length = i[0];
            int width = i[1];
            double diag = Math.sqrt(length*length + width*width);
            if(max<diag){
                max = diag;
                area = length*width;
            }
            else if(max==diag){
                int area1 = length*width;
                if(area1>area) area = area1;
            }
        }
        return area;
    }
}