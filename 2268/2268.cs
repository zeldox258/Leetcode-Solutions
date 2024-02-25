public class Solution {
    public int MinimumNumberOfKeypresses(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumNumberOfKeypresses(root.left), MinimumNumberOfKeypresses(root.right));
    }
}