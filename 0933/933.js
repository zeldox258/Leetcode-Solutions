/**
 * @param {TreeNode} root
 * @return {number}
 */
var numberOfRecentCalls = function(root) {
    if (!root) return 0;
    return 1 + Math.max(numberOfRecentCalls(root.left), numberOfRecentCalls(root.right));
};