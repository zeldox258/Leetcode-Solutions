/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestCommonSubsequence = function(root) {
    if (!root) return 0;
    return 1 + Math.max(longestCommonSubsequence(root.left), longestCommonSubsequence(root.right));
};