
class Solution {
    public int minFlips(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int start=0;
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) if(mat[i][j]==1) start|=1<<(i*n+j);
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> vis=new HashSet<>();
        q.offer(start); vis.add(start);
        int steps=0;
        int[][] dirs={{0,0},{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int sz=q.size();
            for(int k=0;k<sz;k++){
                int cur=q.poll();
                if(cur==0) return steps;
                for(int i=0;i<m;i++) for(int j=0;j<n;j++){
                    int next=cur;
                    for(int[] d:dirs){
                        int nr=i+d[0],nc=j+d[1];
                        if(nr>=0&&nr<m&&nc>=0&&nc<n) next^=1<<(nr*n+nc);
                    }
                    if(!vis.contains(next)){vis.add(next);q.offer(next);}
                }
            }
            steps++;
        }
        return -1;
    }
}
