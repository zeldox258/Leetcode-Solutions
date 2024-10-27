public class Solution {
    public int ClosestPrimeNumbersInRange(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ClosestPrimeNumbersInRange(root.left), ClosestPrimeNumbersInRange(root.right));
    }
}