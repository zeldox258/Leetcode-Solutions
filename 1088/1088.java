
class Solution {
    public int confusingNumberII(int n) {
        int[]map={0,1,-1,-1,-1,-1,9,-1,8,6}; int[]res=new int[1];
        dfs(0,0,1,n,map,res); return res[0];
    }
    void dfs(long num,long rotate,long pos,int n,int[]map,int[]res){
        if(num>0&&num<=n&&num!=rotate) res[0]++;
        if(num>n) return;
        int[]digits={0,1,6,8,9};
        for(int d:digits){long next=num*10+d;if(next==0)continue;long nextRot=(long)map[d]*pos+rotate;dfs(next,nextRot,pos*10,n,map,res);}
    }
}
