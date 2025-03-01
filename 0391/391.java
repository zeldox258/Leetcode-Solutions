
import java.util.*;
class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        int minX=Integer.MAX_VALUE,minY=Integer.MAX_VALUE,maxX=Integer.MIN_VALUE,maxY=Integer.MIN_VALUE;
        long area=0; Set<String> set=new HashSet<>();
        for(int[] r:rectangles){
            minX=Math.min(minX,r[0]);minY=Math.min(minY,r[1]);maxX=Math.max(maxX,r[2]);maxY=Math.max(maxY,r[3]);
            area+=(long)(r[2]-r[0])*(r[3]-r[1]);
            String[] corners={r[0]+","+r[1],r[0]+","+r[3],r[2]+","+r[1],r[2]+","+r[3]};
            for(String c:corners){if(!set.add(c))set.remove(c);}
        }
        if(set.size()!=4||!set.contains(minX+","+minY)||!set.contains(minX+","+maxY)||!set.contains(maxX+","+minY)||!set.contains(maxX+","+maxY)) return false;
        return area==(long)(maxX-minX)*(maxY-minY);
    }
}
