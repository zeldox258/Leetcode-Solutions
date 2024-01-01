class Solution {
    public int solve2568(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2568(root.left),solve2568(root.right));
    }
}