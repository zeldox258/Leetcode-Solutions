public class Solution {
    public int LargestSumOfAverages(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LargestSumOfAverages(root.left), LargestSumOfAverages(root.right));
    }
}