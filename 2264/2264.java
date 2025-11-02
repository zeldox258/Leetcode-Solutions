class Solution {
    public int solve2264(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2264(root.left),solve2264(root.right));
    }
}