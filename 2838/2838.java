class Solution {
    public int solve2838(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2838(root.left),solve2838(root.right));
    }
}