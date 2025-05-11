public class Solution {
    public int UniqueWordAbbreviation(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(UniqueWordAbbreviation(root.left), UniqueWordAbbreviation(root.right));
    }
}