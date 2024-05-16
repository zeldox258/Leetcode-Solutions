/**
 * @param {TreeNode} root
 * @return {number}
 */
var customersWhoNeverOrder = function(root) {
    if (!root) return 0;
    return 1 + Math.max(customersWhoNeverOrder(root.left), customersWhoNeverOrder(root.right));
};