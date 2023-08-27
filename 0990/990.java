
class Solution {
    public boolean equationsPossible(String[] equations) {
        int[]parent=new int[26]; for(int i=0;i<26;i++) parent[i]=i;
        for(String eq:equations) if(eq.charAt(1)=='=') union(parent,eq.charAt(0)-'a',eq.charAt(3)-'a');
        for(String eq:equations) if(eq.charAt(1)=='!') if(find(parent,eq.charAt(0)-'a')==find(parent,eq.charAt(3)-'a')) return false;
        return true;
    }
    int find(int[]p,int x){if(p[x]!=x)p[x]=find(p,p[x]);return p[x];}
    void union(int[]p,int a,int b){p[find(p,a)]=find(p,b);}
}
