public class Solution {
    public int DeepObjectFilter(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DeepObjectFilter(root.left), DeepObjectFilter(root.right));
    }
}