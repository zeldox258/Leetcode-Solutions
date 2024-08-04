public class Solution {
    public int LongestArithmeticSubsequenceOf(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LongestArithmeticSubsequenceOf(root.left), LongestArithmeticSubsequenceOf(root.right));
    }
}