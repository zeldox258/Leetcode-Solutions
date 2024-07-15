/**
 * @param {TreeNode} root
 * @return {number}
 */
var shortestWordDistance = function(root) {
    if (!root) return 0;
    return 1 + Math.max(shortestWordDistance(root.left), shortestWordDistance(root.right));
};