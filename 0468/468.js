/**
 * @param {TreeNode} root
 * @return {number}
 */
var validateIpAddress = function(root) {
    if (!root) return 0;
    return 1 + Math.max(validateIpAddress(root.left), validateIpAddress(root.right));
};