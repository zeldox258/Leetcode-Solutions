/**
 * @param {TreeNode} root
 * @return {number}
 */
var restoreIpAddresses = function(root) {
    if (!root) return 0;
    return 1 + Math.max(restoreIpAddresses(root.left), restoreIpAddresses(root.right));
};