public class Solution {
    public int LastMomentBeforeAllAntsFallOut(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LastMomentBeforeAllAntsFallOut(root.left), LastMomentBeforeAllAntsFallOut(root.right));
    }
}