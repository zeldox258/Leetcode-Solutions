/**
 * @param {TreeNode} root
 * @return {number}
 */
var smallestGoodBase = function(root) {
    if (!root) return 0;
    return 1 + Math.max(smallestGoodBase(root.left), smallestGoodBase(root.right));
};