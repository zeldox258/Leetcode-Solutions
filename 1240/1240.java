
class Solution {
    int res=Integer.MAX_VALUE;
    public int tilingRectangle(int n, int m) {
        if(n>m){int t=n;n=m;m=t;}
        dfs(new int[m],n,m,0);
        return res;
    }
    void dfs(int[] height,int n,int m,int cnt){
        if(cnt>=res) return;
        int pos=-1,minH=Integer.MAX_VALUE;
        for(int i=0;i<m;i++) if(height[i]<minH){minH=height[i];pos=i;}
        if(minH==n){res=Math.min(res,cnt);return;}
        int maxW=1;
        while(pos+maxW<m&&height[pos+maxW]==minH) maxW++;
        for(int w=maxW;w>=1;w--){
            int maxH=Math.min(n-minH,w);
            for(int h=maxH;h>=1;h--){
                for(int k=0;k<w;k++) height[pos+k]+=h;
                dfs(height,n,m,cnt+1);
                for(int k=0;k<w;k++) height[pos+k]-=h;
            }
        }
    }
}
