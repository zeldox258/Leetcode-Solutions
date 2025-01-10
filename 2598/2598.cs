public class Solution {
    public int SmallestMissingNonnegativeInte(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SmallestMissingNonnegativeInte(root.left), SmallestMissingNonnegativeInte(root.right));
    }
}