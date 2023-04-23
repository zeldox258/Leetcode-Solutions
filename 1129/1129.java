
class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        List<int[]>[] graph=new List[n];
        for(int i=0;i<n;i++) graph[i]=new ArrayList<>();
        for(int[] e:redEdges) graph[e[0]].add(new int[]{e[1],0});
        for(int[] e:blueEdges) graph[e[0]].add(new int[]{e[1],1});
        int[] res=new int[n]; Arrays.fill(res,-1);
        boolean[][] vis=new boolean[n][2];
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0}); q.offer(new int[]{0,1});
        vis[0][0]=vis[0][1]=true; res[0]=0; int dist=0;
        while(!q.isEmpty()){
            int sz=q.size(); dist++;
            for(int i=0;i<sz;i++){
                int[] cur=q.poll();
                for(int[] nb:graph[cur[0]]){
                    if(nb[1]!=cur[1]&&!vis[nb[0]][nb[1]]){
                        vis[nb[0]][nb[1]]=true;
                        if(res[nb[0]]==-1) res[nb[0]]=dist;
                        q.offer(new int[]{nb[0],nb[1]});
                    }
                }
            }
        }
        return res;
    }
}
