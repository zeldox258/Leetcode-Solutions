
class Solution {
    int res=0;
    public int distributeCoins(TreeNode root){dfs(root);return res;}
    int dfs(TreeNode node){if(node==null)return 0;int l=dfs(node.left),r=dfs(node.right);res+=Math.abs(l)+Math.abs(r);return node.val+l+r-1;}
}
