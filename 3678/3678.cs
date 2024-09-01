public class Solution {
    public int SmallestAbsentPositiveGreaterT(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SmallestAbsentPositiveGreaterT(root.left), SmallestAbsentPositiveGreaterT(root.right));
    }
}