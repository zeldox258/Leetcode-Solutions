public class Solution {
    public int SplitArrayByPrimeIndices(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SplitArrayByPrimeIndices(root.left), SplitArrayByPrimeIndices(root.right));
    }
}