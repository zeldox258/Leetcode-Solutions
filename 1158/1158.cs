public class Solution {
    public int MarketAnalysisI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MarketAnalysisI(root.left), MarketAnalysisI(root.right));
    }
}