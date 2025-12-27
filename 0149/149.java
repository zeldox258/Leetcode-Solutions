import java.util.*;
class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length,max=1;
        for(int i=0;i<n;i++){
            Map<String,Integer> map=new HashMap<>();
            for(int j=i+1;j<n;j++){
                int dx=points[j][0]-points[i][0],dy=points[j][1]-points[i][1];
                int g=gcd(Math.abs(dx),Math.abs(dy));
                if(g!=0){dx/=g;dy/=g;}
                if(dy<0||(dy==0&&dx<0)){dx=-dx;dy=-dy;}
                String key=dx+","+dy;
                map.put(key,map.getOrDefault(key,0)+1);
                max=Math.max(max,map.get(key)+1);
            }
        }
        return max;
    }
    int gcd(int a,int b){return b==0?a:gcd(b,a%b);}
}