public class Solution {
    public int DropMissingData(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DropMissingData(root.left), DropMissingData(root.right));
    }
}