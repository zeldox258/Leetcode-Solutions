class Solution {
    public int solve3333(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3333(root.left),solve3333(root.right));
    }
}