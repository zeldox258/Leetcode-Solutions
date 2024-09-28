/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumProductOfWordLengths = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumProductOfWordLengths(root.left), maximumProductOfWordLengths(root.right));
};