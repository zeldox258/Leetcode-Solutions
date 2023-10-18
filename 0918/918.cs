public class Solution {
    public int MaximumSumCircularSubarray(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumSumCircularSubarray(root.left), MaximumSumCircularSubarray(root.right));
    }
}