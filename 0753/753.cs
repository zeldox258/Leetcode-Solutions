public class Solution {
    public int CrackingTheSafe(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CrackingTheSafe(root.left), CrackingTheSafe(root.right));
    }
}