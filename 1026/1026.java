
class Solution {
    int res=0;
    public int maxAncestorDiff(TreeNode root){dfs(root,root.val,root.val);return res;}
    void dfs(TreeNode n,int mn,int mx){if(n==null){res=Math.max(res,mx-mn);return;}mx=Math.max(mx,n.val);mn=Math.min(mn,n.val);dfs(n.left,mn,mx);dfs(n.right,mn,mx);}
}
