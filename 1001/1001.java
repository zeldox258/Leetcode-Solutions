
class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        java.util.Map<Integer,Integer> row=new java.util.HashMap<>(),col=new java.util.HashMap<>(),diag=new java.util.HashMap<>(),anti=new java.util.HashMap<>();
        java.util.Set<Long> lampSet=new java.util.HashSet<>();
        for(int[]l:lamps){long key=(long)l[0]*n+l[1];if(lampSet.add(key)){row.merge(l[0],1,Integer::sum);col.merge(l[1],1,Integer::sum);diag.merge(l[0]-l[1],1,Integer::sum);anti.merge(l[0]+l[1],1,Integer::sum);}}
        int[]res=new int[queries.length];
        for(int i=0;i<queries.length;i++){int r=queries[i][0],c=queries[i][1];if(row.getOrDefault(r,0)>0||col.getOrDefault(c,0)>0||diag.getOrDefault(r-c,0)>0||anti.getOrDefault(r+c,0)>0)res[i]=1;for(int dr=-1;dr<=1;dr++)for(int dc=-1;dc<=1;dc++){long key=(long)(r+dr)*n+(c+dc);if(lampSet.remove(key)){row.merge(r+dr,-1,Integer::sum);col.merge(c+dc,-1,Integer::sum);diag.merge(r+dr-(c+dc),-1,Integer::sum);anti.merge(r+dr+c+dc,-1,Integer::sum);}}}
        return res;
    }
}
