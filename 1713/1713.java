class Solution {
    public int solve1713(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1713(root.left),solve1713(root.right));
    }
}