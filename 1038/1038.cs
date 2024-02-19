public class Solution {
    public int BinarySearchTreeToGreaterSumTr(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(BinarySearchTreeToGreaterSumTr(root.left), BinarySearchTreeToGreaterSumTr(root.right));
    }
}