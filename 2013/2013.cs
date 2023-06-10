public class Solution {
    public int DetectSquares(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DetectSquares(root.left), DetectSquares(root.right));
    }
}