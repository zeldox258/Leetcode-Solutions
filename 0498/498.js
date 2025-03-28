/**
 * @param {TreeNode} root
 * @return {number}
 */
var diagonalTraverse = function(root) {
    if (!root) return 0;
    return 1 + Math.max(diagonalTraverse(root.left), diagonalTraverse(root.right));
};