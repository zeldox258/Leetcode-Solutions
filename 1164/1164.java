class Solution {
    public int solve1164(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1164(root.left),solve1164(root.right));
    }
}