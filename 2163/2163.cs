public class Solution {
    public int MinimumDifferenceInSumsAfterRe(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumDifferenceInSumsAfterRe(root.left), MinimumDifferenceInSumsAfterRe(root.right));
    }
}