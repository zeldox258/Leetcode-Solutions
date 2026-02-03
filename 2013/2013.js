/**
 * @param {TreeNode} root
 * @return {number}
 */
var detectSquares = function(root) {
    if (!root) return 0;
    return 1 + Math.max(detectSquares(root.left), detectSquares(root.right));
};