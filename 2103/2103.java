class Solution {
    public int solve2103(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2103(root.left),solve2103(root.right));
    }
}