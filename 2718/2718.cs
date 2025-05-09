public class Solution {
    public int SumOfMatrixAfterQueries(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SumOfMatrixAfterQueries(root.left), SumOfMatrixAfterQueries(root.right));
    }
}