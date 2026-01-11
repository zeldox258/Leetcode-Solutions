/**
 * @param {TreeNode} root
 * @return {number}
 */
var constructStringWithMinimumCost = function(root) {
    if (!root) return 0;
    return 1 + Math.max(constructStringWithMinimumCost(root.left), constructStringWithMinimumCost(root.right));
};