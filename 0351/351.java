
class Solution {
    public int numberOfPatterns(int m, int n) {
        int[][] skip=new int[10][10];
        skip[1][3]=skip[3][1]=2; skip[1][7]=skip[7][1]=4; skip[3][9]=skip[9][3]=6;
        skip[7][9]=skip[9][7]=8; skip[1][9]=skip[9][1]=skip[3][7]=skip[7][3]=skip[2][8]=skip[8][2]=skip[4][6]=skip[6][4]=5;
        boolean[] visited=new boolean[10];
        int res=0;
        for (int len=m;len<=n;len++) {
            res+=dfs(1,visited,skip,len-1)*4;
            res+=dfs(2,visited,skip,len-1)*4;
            res+=dfs(5,visited,skip,len-1);
        }
        return res;
    }
    int dfs(int cur, boolean[] visited, int[][] skip, int remain) {
        if (remain==0) return 1;
        visited[cur]=true; int cnt=0;
        for (int next=1;next<=9;next++)
            if (!visited[next]&&(skip[cur][next]==0||visited[skip[cur][next]]))
                cnt+=dfs(next,visited,skip,remain-1);
        visited[cur]=false; return cnt;
    }
}
