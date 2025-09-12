/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestCommonSuffixQueries = function(root) {
    if (!root) return 0;
    return 1 + Math.max(longestCommonSuffixQueries(root.left), longestCommonSuffixQueries(root.right));
};