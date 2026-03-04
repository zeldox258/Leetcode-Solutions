public class Solution {
    public int MaximumNumberOfRemovalQueriesT(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumNumberOfRemovalQueriesT(root.left), MaximumNumberOfRemovalQueriesT(root.right));
    }
}