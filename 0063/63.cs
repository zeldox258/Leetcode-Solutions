public class Solution {
    public int UniquePathsIi(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(UniquePathsIi(root.left), UniquePathsIi(root.right));
    }
}