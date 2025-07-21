public class Solution {
    public int MinimumTimeToMakeRopeColorful(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumTimeToMakeRopeColorful(root.left), MinimumTimeToMakeRopeColorful(root.right));
    }
}