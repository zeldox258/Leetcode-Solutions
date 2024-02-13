/**
 * @param {TreeNode} root
 * @return {number}
 */
var shortestPathInAGridWithObstacl = function(root) {
    if (!root) return 0;
    return 1 + Math.max(shortestPathInAGridWithObstacl(root.left), shortestPathInAGridWithObstacl(root.right));
};