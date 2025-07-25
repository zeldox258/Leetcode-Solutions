public class Solution {
    public int MaxSumOfRectangleNoLargerThanK(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaxSumOfRectangleNoLargerThanK(root.left), MaxSumOfRectangleNoLargerThanK(root.right));
    }
}