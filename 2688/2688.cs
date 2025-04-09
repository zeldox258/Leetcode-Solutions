public class Solution {
    public int FindActiveUsers(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindActiveUsers(root.left), FindActiveUsers(root.right));
    }
}