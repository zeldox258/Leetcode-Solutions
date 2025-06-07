/**
 * @param {TreeNode} root
 * @return {number}
 */
var countItemsMatchingARule = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countItemsMatchingARule(root.left), countItemsMatchingARule(root.right));
};