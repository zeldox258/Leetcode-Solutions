public class Solution {
    public int CheckIfNumberHasEqualDigitCoun(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CheckIfNumberHasEqualDigitCoun(root.left), CheckIfNumberHasEqualDigitCoun(root.right));
    }
}