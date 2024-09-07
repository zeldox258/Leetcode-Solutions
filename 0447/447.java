
import java.util.*;
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res=0;
        for(int[] p:points){
            Map<Integer,Integer> map=new HashMap<>();
            for(int[] q:points){int d=dist(p,q);map.merge(d,1,Integer::sum);}
            for(int cnt:map.values()) res+=cnt*(cnt-1);
        }
        return res;
    }
    int dist(int[] a,int[] b){return (a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]);}
}
