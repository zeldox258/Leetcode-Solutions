public class Solution {
    public int SummaryRanges(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SummaryRanges(root.left), SummaryRanges(root.right));
    }
}