class Solution {
    public int solve1188(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1188(root.left),solve1188(root.right));
    }
}