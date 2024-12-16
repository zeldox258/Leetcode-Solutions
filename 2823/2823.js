/**
 * @param {TreeNode} root
 * @return {number}
 */
var deepObjectFilter = function(root) {
    if (!root) return 0;
    return 1 + Math.max(deepObjectFilter(root.left), deepObjectFilter(root.right));
};