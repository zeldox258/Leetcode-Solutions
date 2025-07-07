public class Solution {
    public int SumOfSquaresOfSpecialElements(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SumOfSquaresOfSpecialElements(root.left), SumOfSquaresOfSpecialElements(root.right));
    }
}