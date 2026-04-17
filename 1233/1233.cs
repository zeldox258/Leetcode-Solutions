public class Solution {
    public int RemoveSubfoldersFromTheFilesys(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(RemoveSubfoldersFromTheFilesys(root.left), RemoveSubfoldersFromTheFilesys(root.right));
    }
}