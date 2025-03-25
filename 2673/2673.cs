public class Solution {
    public int MakeCostsOfPathsEqualInABinary(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MakeCostsOfPathsEqualInABinary(root.left), MakeCostsOfPathsEqualInABinary(root.right));
    }
}