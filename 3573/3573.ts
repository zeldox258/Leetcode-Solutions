function bestTimeToBuyAndSellStockV(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(bestTimeToBuyAndSellStockV(root.left), bestTimeToBuyAndSellStockV(root.right));
}