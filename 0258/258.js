/**
 * @param {TreeNode} root
 * @return {number}
 */
var addDigits = function(root) {
    if (!root) return 0;
    return 1 + Math.max(addDigits(root.left), addDigits(root.right));
};