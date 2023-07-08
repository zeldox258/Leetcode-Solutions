
class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        java.util.Map<Integer,java.util.List<Integer>> map=new java.util.HashMap<>();
        for(int[]p:paths){map.computeIfAbsent(p[0],k->new java.util.ArrayList<>()).add(p[1]);map.computeIfAbsent(p[1],k->new java.util.ArrayList<>()).add(p[0]);}
        int[]res=new int[n+1];
        for(int i=1;i<=n;i++){boolean[]used=new boolean[5];for(int nb:map.getOrDefault(i,new java.util.ArrayList<>()))used[res[nb]]=true;for(int c=1;c<=4;c++)if(!used[c]){res[i]=c;break;}}
        return java.util.Arrays.copyOfRange(res,1,n+1);
    }
}
