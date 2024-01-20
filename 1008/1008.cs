public class Solution {
    public int ConstructBinarySearchTreeFromP(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ConstructBinarySearchTreeFromP(root.left), ConstructBinarySearchTreeFromP(root.right));
    }
}