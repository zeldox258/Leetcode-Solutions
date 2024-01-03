public class Solution {
    public int MaximumDifferenceBetweenAdjace(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumDifferenceBetweenAdjace(root.left), MaximumDifferenceBetweenAdjace(root.right));
    }
}