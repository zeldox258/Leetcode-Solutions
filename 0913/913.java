
class Solution {
    public int catAndMouse(int[][] graph) {
        int n=graph.length; int[][][] dp=new int[2*n*n][n][n];
        // BFS approach: state=(turn,mouse,cat) 1=mouse wins,2=cat wins
        int[][][]color=new int[n][n][3]; int[][][]degree=new int[n][n][3];
        for(int m=0;m<n;m++) for(int c=0;c<n;c++){degree[m][c][1]=graph[m].length;degree[m][c][2]=graph[c].length;for(int x:graph[c])if(x==0){degree[m][c][2]--;break;}}
        java.util.Queue<int[]>q=new java.util.LinkedList<>();
        for(int i=1;i<n;i++){for(int t=1;t<=2;t++){color[0][i][t]=2;q.offer(new int[]{0,i,t,2});color[i][i][t]=1;q.offer(new int[]{i,i,t,1});}}
        while(!q.isEmpty()){int[]s=q.poll();int m=s[0],c=s[1],t=s[2],res=s[3];
            java.util.List<int[]>parents=new java.util.ArrayList<>();
            if(t==2){for(int pm:graph[m])parents.add(new int[]{pm,c,1});}else{for(int pc:graph[c])if(pc!=0)parents.add(new int[]{m,pc,2});}
            for(int[]prev:parents){int pm=prev[0],pc=prev[1],pt=prev[2];if(color[pm][pc][pt]!=0)continue;if(res==pt){color[pm][pc][pt]=res;q.offer(new int[]{pm,pc,pt,res});}else if(--degree[pm][pc][pt]==0){color[pm][pc][pt]=res;q.offer(new int[]{pm,pc,pt,res});}}}
        return color[1][2][1];
    }
}
