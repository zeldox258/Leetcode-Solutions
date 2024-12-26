class Solution {
    public int solve2763(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2763(root.left),solve2763(root.right));
    }
}