public class Solution {
    public int LeftmostColumnWithAtLeastAOne(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LeftmostColumnWithAtLeastAOne(root.left), LeftmostColumnWithAtLeastAOne(root.right));
    }
}