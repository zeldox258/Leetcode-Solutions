class Solution {
    public int solve2298(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2298(root.left),solve2298(root.right));
    }
}