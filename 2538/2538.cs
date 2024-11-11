public class Solution {
    public int DifferenceBetweenMaximumAndMin(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DifferenceBetweenMaximumAndMin(root.left), DifferenceBetweenMaximumAndMin(root.right));
    }
}