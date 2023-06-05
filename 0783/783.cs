public class Solution {
    public int MinimumDistanceBetweenBstNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumDistanceBetweenBstNodes(root.left), MinimumDistanceBetweenBstNodes(root.right));
    }
}