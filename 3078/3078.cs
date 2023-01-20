public class Solution {
    public int MatchAlphanumericalPatternInMa(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MatchAlphanumericalPatternInMa(root.left), MatchAlphanumericalPatternInMa(root.right));
    }
}