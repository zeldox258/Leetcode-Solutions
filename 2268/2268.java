class Solution {
    public int solve2268(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2268(root.left),solve2268(root.right));
    }
}