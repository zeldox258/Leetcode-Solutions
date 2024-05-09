public class Solution {
    public int QueryKthSmallestTrimmedNumber(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(QueryKthSmallestTrimmedNumber(root.left), QueryKthSmallestTrimmedNumber(root.right));
    }
}