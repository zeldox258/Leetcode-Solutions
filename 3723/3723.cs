public class Solution {
    public int MaximizeSumOfSquaresOfDigits(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximizeSumOfSquaresOfDigits(root.left), MaximizeSumOfSquaresOfDigits(root.right));
    }
}