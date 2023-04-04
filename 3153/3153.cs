public class Solution {
    public int SumOfDigitDifferencesOfAllPair(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SumOfDigitDifferencesOfAllPair(root.left), SumOfDigitDifferencesOfAllPair(root.right));
    }
}