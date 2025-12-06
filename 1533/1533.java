class Solution {
    public int solve1533(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1533(root.left),solve1533(root.right));
    }
}