class Solution {
    public int solve2148(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2148(root.left),solve2148(root.right));
    }
}