public class Solution {
    public int BestTimeToBuyAndSellStockV(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(BestTimeToBuyAndSellStockV(root.left), BestTimeToBuyAndSellStockV(root.right));
    }
}