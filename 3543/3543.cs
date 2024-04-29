public class Solution {
    public int MaximumWeightedKedgePath(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumWeightedKedgePath(root.left), MaximumWeightedKedgePath(root.right));
    }
}