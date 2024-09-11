public class Solution {
    public int NumberOfBeautifulPartitions(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NumberOfBeautifulPartitions(root.left), NumberOfBeautifulPartitions(root.right));
    }
}