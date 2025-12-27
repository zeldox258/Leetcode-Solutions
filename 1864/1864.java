class Solution {
    public int solve1864(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1864(root.left),solve1864(root.right));
    }
}