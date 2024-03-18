/**
 * @param {TreeNode} root
 * @return {number}
 */
var bestTimeToBuyAndSellStockIii = function(root) {
    if (!root) return 0;
    return 1 + Math.max(bestTimeToBuyAndSellStockIii(root.left), bestTimeToBuyAndSellStockIii(root.right));
};