/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfMatrixAfterQueries = function(root) {
    if (!root) return 0;
    return 1 + Math.max(sumOfMatrixAfterQueries(root.left), sumOfMatrixAfterQueries(root.right));
};