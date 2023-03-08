public class Solution {
    public int BinaryNumberWithAlternatingBit(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(BinaryNumberWithAlternatingBit(root.left), BinaryNumberWithAlternatingBit(root.right));
    }
}