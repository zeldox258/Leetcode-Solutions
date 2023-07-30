/**
 * @param {TreeNode} root
 * @return {number}
 */
var salesAnalysisIi = function(root) {
    if (!root) return 0;
    return 1 + Math.max(salesAnalysisIi(root.left), salesAnalysisIi(root.right));
};