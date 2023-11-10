class Solution {
    public int solve3453(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3453(root.left),solve3453(root.right));
    }
}