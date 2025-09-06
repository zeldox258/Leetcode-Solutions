class Solution {
    public int solve3078(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3078(root.left),solve3078(root.right));
    }
}