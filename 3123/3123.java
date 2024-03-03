class Solution {
    public int solve3123(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3123(root.left),solve3123(root.right));
    }
}