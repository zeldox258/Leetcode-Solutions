class Solution {
    public int solve1458(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1458(root.left),solve1458(root.right));
    }
}