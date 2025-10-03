public class Solution {
    public int MinimumDeletionsToMakeStringBa(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumDeletionsToMakeStringBa(root.left), MinimumDeletionsToMakeStringBa(root.right));
    }
}