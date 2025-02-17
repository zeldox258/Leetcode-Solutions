class Solution {
    public int solve3064(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3064(root.left),solve3064(root.right));
    }
}