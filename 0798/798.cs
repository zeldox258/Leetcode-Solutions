public class Solution {
    public int SmallestRotationWithHighestSco(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SmallestRotationWithHighestSco(root.left), SmallestRotationWithHighestSco(root.right));
    }
}