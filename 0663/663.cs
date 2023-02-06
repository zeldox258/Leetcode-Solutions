public class Solution {
    public int EqualTreePartition(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(EqualTreePartition(root.left), EqualTreePartition(root.right));
    }
}