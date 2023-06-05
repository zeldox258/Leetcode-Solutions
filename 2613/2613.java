class Solution {
    public int solve2613(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2613(root.left),solve2613(root.right));
    }
}