class Solution {
    public int solve2164(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2164(root.left),solve2164(root.right));
    }
}