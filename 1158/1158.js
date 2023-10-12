/**
 * @param {TreeNode} root
 * @return {number}
 */
var marketAnalysisI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(marketAnalysisI(root.left), marketAnalysisI(root.right));
};