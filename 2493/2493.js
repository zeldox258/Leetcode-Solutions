/**
 * @param {TreeNode} root
 * @return {number}
 */
var divideNodesIntoTheMaximumNumbe = function(root) {
    if (!root) return 0;
    return 1 + Math.max(divideNodesIntoTheMaximumNumbe(root.left), divideNodesIntoTheMaximumNumbe(root.right));
};