import java.util.*;
class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<int[]> points=new ArrayList<>();
        for(int[] b:buildings){points.add(new int[]{b[0],-b[2]});points.add(new int[]{b[1],b[2]});}
        points.sort((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        TreeMap<Integer,Integer> map=new TreeMap<>();map.put(0,1);
        List<List<Integer>> res=new ArrayList<>();int prev=0;
        for(int[] p:points){
            if(p[1]<0) map.merge(-p[1],1,Integer::sum);
            else{map.merge(p[1],-1,Integer::sum);if(map.get(p[1])==0)map.remove(p[1]);}
            int cur=map.lastKey();
            if(cur!=prev){res.add(Arrays.asList(p[0],cur));prev=cur;}
        }
        return res;
    }
}