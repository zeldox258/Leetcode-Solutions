class Solution {
    public int solve2324(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2324(root.left),solve2324(root.right));
    }
}