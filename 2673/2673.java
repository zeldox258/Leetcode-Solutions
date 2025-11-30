class Solution {
    public int solve2673(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2673(root.left),solve2673(root.right));
    }
}