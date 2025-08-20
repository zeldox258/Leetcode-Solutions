class Solution {
    public int solve813(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve813(root.left),solve813(root.right));
    }
}