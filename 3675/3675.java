class Solution {
    public int solve3675(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3675(root.left),solve3675(root.right));
    }
}