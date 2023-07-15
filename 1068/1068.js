/**
 * @param {TreeNode} root
 * @return {number}
 */
var productSalesAnalysisI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(productSalesAnalysisI(root.left), productSalesAnalysisI(root.right));
};