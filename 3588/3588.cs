public class Solution {
    public int FindMaximumAreaOfATriangle(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindMaximumAreaOfATriangle(root.left), FindMaximumAreaOfATriangle(root.right));
    }
}