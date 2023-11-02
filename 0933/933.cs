public class Solution {
    public int NumberOfRecentCalls(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NumberOfRecentCalls(root.left), NumberOfRecentCalls(root.right));
    }
}