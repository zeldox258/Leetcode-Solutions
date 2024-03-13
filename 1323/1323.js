/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximum69Number = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximum69Number(root.left), maximum69Number(root.right));
};