public class Solution {
    public int TheNumberOfWaysToMakeTheSum(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(TheNumberOfWaysToMakeTheSum(root.left), TheNumberOfWaysToMakeTheSum(root.right));
    }
}