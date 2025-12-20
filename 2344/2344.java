class Solution {
    public int solve2344(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2344(root.left),solve2344(root.right));
    }
}