class Solution {
    public int solve2718(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2718(root.left),solve2718(root.right));
    }
}