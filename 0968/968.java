
class Solution {
    int res=0;
    public int minCameraCover(TreeNode root) { if(dfs(root)==0) res++; return res; }
    int dfs(TreeNode node){ if(node==null) return 1; int l=dfs(node.left),r=dfs(node.right); if(l==0||r==0){res++;return 2;} return l==2||r==2?1:0; }
}
