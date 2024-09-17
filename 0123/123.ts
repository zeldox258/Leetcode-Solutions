function bestTimeToBuyAndSellStockIii(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(bestTimeToBuyAndSellStockIii(root.left), bestTimeToBuyAndSellStockIii(root.right));
}