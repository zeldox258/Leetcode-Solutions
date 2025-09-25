/**
 * @param {TreeNode} root
 * @return {number}
 */
var validParenthesisString = function(root) {
    if (!root) return 0;
    return 1 + Math.max(validParenthesisString(root.left), validParenthesisString(root.right));
};