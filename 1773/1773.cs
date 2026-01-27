public class Solution {
    public int CountItemsMatchingARule(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountItemsMatchingARule(root.left), CountItemsMatchingARule(root.right));
    }
}