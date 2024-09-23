public class Solution {
    public int RotateImage(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(RotateImage(root.left), RotateImage(root.right));
    }
}