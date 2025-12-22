class Solution {
    public int solve2118(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2118(root.left),solve2118(root.right));
    }
}