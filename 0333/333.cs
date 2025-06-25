public class Solution {
    public int LargestBstSubtree(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LargestBstSubtree(root.left), LargestBstSubtree(root.right));
    }
}