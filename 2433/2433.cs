public class Solution {
    public int FindTheOriginalArrayOfPrefixXo(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindTheOriginalArrayOfPrefixXo(root.left), FindTheOriginalArrayOfPrefixXo(root.right));
    }
}