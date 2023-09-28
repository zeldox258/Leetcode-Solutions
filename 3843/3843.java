class Solution {
    public int solve3843(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3843(root.left),solve3843(root.right));
    }
}