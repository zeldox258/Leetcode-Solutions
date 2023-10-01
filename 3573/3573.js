/**
 * @param {TreeNode} root
 * @return {number}
 */
var bestTimeToBuyAndSellStockV = function(root) {
    if (!root) return 0;
    return 1 + Math.max(bestTimeToBuyAndSellStockV(root.left), bestTimeToBuyAndSellStockV(root.right));
};