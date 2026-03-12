public class Solution {
    public int MinimumAbsoluteSumDifference(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumAbsoluteSumDifference(root.left), MinimumAbsoluteSumDifference(root.right));
    }
}