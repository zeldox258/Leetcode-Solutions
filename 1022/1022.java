
class Solution {
    public int sumRootToLeaf(TreeNode root){return dfs(root,0);}
    int dfs(TreeNode n,int cur){if(n==null)return 0;cur=cur*2+n.val;if(n.left==null&&n.right==null)return cur;return dfs(n.left,cur)+dfs(n.right,cur);}
}
