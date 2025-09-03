class Solution {
    public int solve2944(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2944(root.left),solve2944(root.right));
    }
}