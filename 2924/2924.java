class Solution {
    public int findChampion(int n, int[][] edges) {
        int inDegree[]=new int[n];
        int champCount=0;
        int champ=-1;
        for(int edge[]:edges){
            inDegree[edge[1]]++;
        }
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0){
                champCount++;
                champ=i;
            }
        }
        return champCount>1?-1:champ;
    }
}