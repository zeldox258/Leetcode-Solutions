public class Solution {
    public int FindTheOriginalTypedStringIi(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindTheOriginalTypedStringIi(root.left), FindTheOriginalTypedStringIi(root.right));
    }
}