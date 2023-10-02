
class Solution {
    public int largestComponentSize(int[] nums) {
        int max=0; for(int v:nums) max=Math.max(max,v);
        int[]parent=new int[max+1]; for(int i=0;i<=max;i++) parent[i]=i;
        for(int v:nums) for(int f=2;f*f<=v;f++) if(v%f==0){union(parent,v,f);union(parent,v,v/f);}
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>(); int res=0;
        for(int v:nums){int root=find(parent,v);cnt.merge(root,1,Integer::sum);res=Math.max(res,cnt.get(root));}
        return res;
    }
    int find(int[]p,int x){if(p[x]!=x)p[x]=find(p,p[x]);return p[x];}
    void union(int[]p,int a,int b){a=find(p,a);b=find(p,b);if(a!=b)p[a]=b;}
}
