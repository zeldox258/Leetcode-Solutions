class Solution {
    public int solve2464(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2464(root.left),solve2464(root.right));
    }
}