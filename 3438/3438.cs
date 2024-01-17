public class Solution {
    public int FindValidPairOfAdjacentDigitsI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindValidPairOfAdjacentDigitsI(root.left), FindValidPairOfAdjacentDigitsI(root.right));
    }
}