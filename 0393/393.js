/**
 * @param {TreeNode} root
 * @return {number}
 */
var utf8Validation = function(root) {
    if (!root) return 0;
    return 1 + Math.max(utf8Validation(root.left), utf8Validation(root.right));
};