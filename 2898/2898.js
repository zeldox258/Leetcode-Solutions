/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumLinearStockScore = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumLinearStockScore(root.left), maximumLinearStockScore(root.right));
};