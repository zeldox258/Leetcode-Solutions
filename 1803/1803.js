/**
 * @param {TreeNode} root
 * @return {number}
 */
var countPairsWithXorInARange = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countPairsWithXorInARange(root.left), countPairsWithXorInARange(root.right));
};