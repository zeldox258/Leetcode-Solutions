
class Solution {
    public boolean isCousins(TreeNode root,int x,int y){int[]xi=new int[2],yi=new int[2];dfs(root,-1,0,x,y,xi,yi);return xi[0]==yi[0]&&xi[1]!=yi[1];}
    void dfs(TreeNode n,int parent,int depth,int x,int y,int[]xi,int[]yi){if(n==null)return;if(n.val==x){xi[0]=depth;xi[1]=parent;}if(n.val==y){yi[0]=depth;yi[1]=parent;}dfs(n.left,n.val,depth+1,x,y,xi,yi);dfs(n.right,n.val,depth+1,x,y,xi,yi);}
}
