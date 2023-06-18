public class Solution {
    public int MaximumNumberOfOperationsToMov(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumNumberOfOperationsToMov(root.left), MaximumNumberOfOperationsToMov(root.right));
    }
}