public class Solution {
    public int Subsets(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(Subsets(root.left), Subsets(root.right));
    }
}