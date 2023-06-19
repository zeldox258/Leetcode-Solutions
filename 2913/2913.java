class Solution {
    public int solve2913(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2913(root.left),solve2913(root.right));
    }
}