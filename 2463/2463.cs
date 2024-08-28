public class Solution {
    public int MinimumTotalDistanceTraveled(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumTotalDistanceTraveled(root.left), MinimumTotalDistanceTraveled(root.right));
    }
}