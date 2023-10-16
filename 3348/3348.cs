public class Solution {
    public int SmallestDivisibleDigitProductI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SmallestDivisibleDigitProductI(root.left), SmallestDivisibleDigitProductI(root.right));
    }
}