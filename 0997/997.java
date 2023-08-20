
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[]in=new int[n+1],out=new int[n+1]; for(int[]t:trust){out[t[0]]++;in[t[1]]++;}
        for(int i=1;i<=n;i++) if(in[i]==n-1&&out[i]==0) return i; return -1;
    }
}
