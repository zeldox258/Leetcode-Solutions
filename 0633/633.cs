public class Solution {
    public int SumOfSquareNumbers(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SumOfSquareNumbers(root.left), SumOfSquareNumbers(root.right));
    }
}