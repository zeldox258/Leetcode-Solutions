/**
 * @param {TreeNode} root
 * @return {number}
 */
var separateTheDigitsInAnArray = function(root) {
    if (!root) return 0;
    return 1 + Math.max(separateTheDigitsInAnArray(root.left), separateTheDigitsInAnArray(root.right));
};