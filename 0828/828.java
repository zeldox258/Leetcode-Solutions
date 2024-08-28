class Solution {
    public int solve828(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve828(root.left),solve828(root.right));
    }
}