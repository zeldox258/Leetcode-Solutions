class Solution {
    public int solve2404(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2404(root.left),solve2404(root.right));
    }
}