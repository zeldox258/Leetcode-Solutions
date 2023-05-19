class Solution {
    public int solve3711(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3711(root.left),solve3711(root.right));
    }
}