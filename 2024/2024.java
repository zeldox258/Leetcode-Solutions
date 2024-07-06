class Solution {
    public int solve2024(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2024(root.left),solve2024(root.right));
    }
}