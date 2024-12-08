public class Solution {
    public int BestTimeToBuyAndSellStockIii(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(BestTimeToBuyAndSellStockIii(root.left), BestTimeToBuyAndSellStockIii(root.right));
    }
}