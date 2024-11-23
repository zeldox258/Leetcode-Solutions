public class Solution {
    public int ConvertSortedArrayToBinarySear(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ConvertSortedArrayToBinarySear(root.left), ConvertSortedArrayToBinarySear(root.right));
    }
}