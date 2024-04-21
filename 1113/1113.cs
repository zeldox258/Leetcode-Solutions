public class Solution {
    public int ReportedPosts(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ReportedPosts(root.left), ReportedPosts(root.right));
    }
}