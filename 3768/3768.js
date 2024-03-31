/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumInversionCountInSubarra = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumInversionCountInSubarra(root.left), minimumInversionCountInSubarra(root.right));
};